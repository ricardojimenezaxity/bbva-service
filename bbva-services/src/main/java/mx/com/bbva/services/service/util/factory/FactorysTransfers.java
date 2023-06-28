package mx.com.bbva.services.service.util.factory;

import mx.com.bbva.commons.to.TransferAccountTO;
import mx.com.bbva.commons.to.TransferSpeiTO;
import mx.com.bbva.model.TransaccionDO;

import java.util.Date;

public class FactorysTransfers {
    TransaccionDO transaccionDO = new TransaccionDO();

    public FactorysTransfers(TransferAccountTO request){
        transaccionDO.setIdTrans(null);
        transaccionDO.setMonto(request.getAmmount());
        transaccionDO.setFecha(new Date());
        transaccionDO.setTarDestino(request.getCardNumberD());
        transaccionDO.setCuentaDestino(request.getAccountNumberD());
        transaccionDO.setClabeDes(request.getClabe());
        transaccionDO.setNomDes(request.getOwnerNameD());
        transaccionDO.setLocation(null);
        transaccionDO.setSpei(null);
        transaccionDO.setCuentaDO(null);
        transaccionDO.setTipoTransDO(null);
        transaccionDO.setBanco(null);
    }

    public FactorysTransfers(TransferAccountTO request, String spei){
        this(request);
        transaccionDO.setSpei(spei);
    }
    public TransaccionDO castTransferTOTOTransferDO(){
        /*TransaccionDO transaccionDO = new TransaccionDO();
        transaccionDO.setIdTrans(null);
        transaccionDO.setMonto(request.getAmmount());
        transaccionDO.setFecha(new Date());
        transaccionDO.setTarDestino(request.getCardNumberD());
        transaccionDO.setCuentaDestino(request.getAccountNumberD());
        transaccionDO.setClabeDes(request.getClabe());
        transaccionDO.setNomDes(request.getOwnerNameD());
        transaccionDO.setLocation(null);
        transaccionDO.setSpei(null);
        transaccionDO.setCuentaDO(null);
        transaccionDO.setTipoTransDO(null);
        transaccionDO.setBanco(null);*/
        return transaccionDO;
    }

}
