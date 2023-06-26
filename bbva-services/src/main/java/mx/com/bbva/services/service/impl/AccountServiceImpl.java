package mx.com.bbva.services.service.impl;

import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.model.CuentaBanDO;
import mx.com.bbva.model.TipoTransDO;
import mx.com.bbva.model.TransaccionDO;
import mx.com.bbva.persistence.CuentaBanDAO;
import mx.com.bbva.persistence.TipoTransDAO;
import mx.com.bbva.persistence.TransaccionDAO;
import mx.com.bbva.services.service.AccountService;
import mx.com.bbva.services.service.util.factory.FactoryTransacciontoTipo;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.com.bbva.services.service.util.factory.FactorysCuentaDOWithBalance;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    CuentaBanDAO cuentaBanDAO;

    @Autowired
    TipoTransDAO tipoTransDAO;

    @Autowired
    TransaccionDAO transaccionDAO;

    @Override
    public BalanceTO getBalance(String accountNumber) {
        CuentaBanDO cuenta = cuentaBanDAO.findDetailsByAccountNum(accountNumber);
        return new FactorysCuentaDOWithBalance().castCuentaDOtoBalanceTO(cuenta);
    }

    @Override
    public List<MovementTO> getAllMovements(String accountNumber) {
        CuentaBanDO cuenta = cuentaBanDAO.findDetailsByAccountNum(accountNumber); // recuperamos la cuenta por el num de cuenta
        List<TransaccionDO> transaccionDO = transaccionDAO.findAllMovements(cuenta.getIdCuenta());
        //System.out.println(transaccionDO.toString());
        FactoryTransacciontoTipo factory = new FactoryTransacciontoTipo();
        List<MovementTO> movimientos = factory.castTransactionToTipo(transaccionDO);
        return movimientos;
    }

    @Override
    public ResponseTO getRetiro(String code) { // Juan
        return null;
    }
}
