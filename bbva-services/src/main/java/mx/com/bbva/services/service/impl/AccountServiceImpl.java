package mx.com.bbva.services.service.impl;

import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.WithdrawalTO;
import mx.com.bbva.model.*;
import mx.com.bbva.persistence.*;
import mx.com.bbva.services.service.AccountService;
import mx.com.bbva.services.service.util.factory.FactoryTransacciontoTipo;
import mx.com.bbva.services.service.util.factory.FactorysWithdrawalAndTransactionDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.com.bbva.services.service.util.factory.FactorysCuentaDOWithBalance;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    CuentaBanDAO cuentaBanDAO;

    @Autowired
    TipoTransDAO tipoTransDAO;

    @Autowired
    TransaccionDAO transaccionDAO;

    @Autowired
    CodReiroDAO codRetiroDAO;

    @Autowired
    BancoDAO bancoDAO;

    @Override
    public BalanceTO getBalance(String accountNumber) {
        CuentaBanDO cuenta = cuentaBanDAO.findDetailsByAccountNum(accountNumber);
        return new FactorysCuentaDOWithBalance().castCuentaDOtoBalanceTO(cuenta);
    }

    @Override
    public List<MovementTO> getAllMovements(String accountNumber) {
        List<MovementTO> reponse = new ArrayList<>();
        CuentaBanDO cuenta = cuentaBanDAO.findDetailsByAccountNum(accountNumber); // recuperamos la cuenta por el num de cuenta
        List<TransaccionDO> transaccionDO = transaccionDAO.findAllMovements(cuenta.getIdCuenta());
        FactoryTransacciontoTipo factory = new FactoryTransacciontoTipo();
        transaccionDO.forEach(e ->{
            MovementTO movimiento = factory.castTransactionToTipo(e);
            TipoTransDO trans = tipoTransDAO.findById(e.getTipoTransDO().getIdTipoTrans()).get();
            movimiento.setType(trans.getDescripcion());
            reponse.add(movimiento);
        });
        return reponse;
    }

        // `ID_TRANS`, `MONTO`, `FECHA`, `TARJETA_DESTINO`, `CUENTA_DESTINO`, `CLABE_DESTINO`, `DESTINATARIO`, `LOCACION`, `SPEI`, `FK_ID_CUENTA`, `FK_ID_TIPOTRANS`, `FK_ID_BANCO`
    @Override
    public ResponseTO createWithdrawal(WithdrawalTO withdrawalTO, Integer code) {
        CodRetiroDO cod = codRetiroDAO.findCode(code);
        if (cod == null) {
            ResponseTO response = new ResponseTO();
            response.setMessage("Código no encontrado");
            return response;
        }
        TransaccionDO transaccionDO = new FactorysWithdrawalAndTransactionDO().castWithdrawalTOToTransaccionDO(withdrawalTO);
        CuentaBanDO cuenta = cuentaBanDAO.findDetailsByAccountNum(withdrawalTO.getAccountNumber());
        transaccionDO.setCuentaDO(cuenta);
        TipoTransDO transDO = new TipoTransDO(1,"Deposito",null);
        transaccionDO.setTipoTransDO(transDO);
        transaccionDO.setBanco(bancoDAO.findBanco(withdrawalTO.getBank()));
        cuenta.setSaldo(cuenta.getSaldo()-withdrawalTO.getAmmount());
        cuentaBanDAO.save(cuenta);
        cuentaBanDAO.flush();
        transaccionDAO.save(transaccionDO);
        transaccionDAO.flush();
        ResponseTO response = new ResponseTO();
        response.setMessage("Retiro registrado");
        return response;
    }
}
