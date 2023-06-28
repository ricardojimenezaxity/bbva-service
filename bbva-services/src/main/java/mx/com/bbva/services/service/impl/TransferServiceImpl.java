package mx.com.bbva.services.service.impl;

import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.TransferAccountTO;
import mx.com.bbva.commons.to.TransferSpeiTO;
import mx.com.bbva.model.CuentaBanDO;
import mx.com.bbva.model.TipoTransDO;
import mx.com.bbva.model.TransaccionDO;
import mx.com.bbva.persistence.BancoDAO;
import mx.com.bbva.persistence.CuentaBanDAO;
import mx.com.bbva.persistence.TransaccionDAO;
import mx.com.bbva.services.service.TransferService;
import mx.com.bbva.services.service.util.factory.FactorysTransfers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    TransaccionDAO transaccionDAO;
    @Autowired
    CuentaBanDAO cuentaBanDAO;
    @Autowired
    BancoDAO bancoDAO;
    @Override
    public ResponseTO tansferenciaC(TransferAccountTO request) {
        TransaccionDO transaccionDO = new FactorysTransfers(request).castTransferTOTOTransferDO();
        CuentaBanDO cuenta = cuentaBanDAO.findDetailsByAccountNum(request.getAccountNumberO());
        transaccionDO.setCuentaDO(cuenta);
        transaccionDO.setBanco(bancoDAO.findBanco(request.getBankD()));
        transaccionDO.setTipoTransDO( new TipoTransDO(3,"Transferencia entre cuentas",null));
        cuenta.setSaldo(cuenta.getSaldo()-request.getAmmount());
        cuentaBanDAO.save(cuenta);
        cuentaBanDAO.flush();
        transaccionDAO.save(transaccionDO);
        transaccionDAO.flush();
        return new ResponseTO(null, "Transferencia realizada con exito");
    }

    @Override
    public ResponseTO transferenciaSpei(TransferSpeiTO request) {
        TransaccionDO transaccionDO = new FactorysTransfers(request,request.getSpeiNumberD()).castTransferTOTOTransferDO();
        CuentaBanDO cuenta = cuentaBanDAO.findDetailsByAccountNum(request.getAccountNumberO());
        transaccionDO.setCuentaDO(cuenta);
        transaccionDO.setBanco(bancoDAO.findBanco(request.getBankD()));
        transaccionDO.setTipoTransDO( new TipoTransDO(4,"TTransferencia realizada con exito",null));
        cuenta.setSaldo(cuenta.getSaldo()-request.getAmmount());
        cuentaBanDAO.save(cuenta);
        cuentaBanDAO.flush();
        transaccionDAO.save(transaccionDO);
        transaccionDAO.flush();
        return new ResponseTO(null, "Transferencia SPEI realizada con exito");
    }

}
