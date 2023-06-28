package mx.com.bbva.services.service.util.factory;

import mx.com.bbva.commons.to.WithdrawalTO;
import mx.com.bbva.model.TransaccionDO;

import java.util.Date;

public class FactorysWithdrawalAndTransactionDO {
        // `ID_TRANS`, `MONTO`, `FECHA`, `TARJETA_DESTINO`, `CUENTA_DESTINO`, `CLABE_DESTINO`, `DESTINATARIO`, `LOCACION`, `SPEI`, `FK_ID_CUENTA`, `FK_ID_TIPOTRANS`, `FK_ID_BANCO`
    public TransaccionDO castWithdrawalTOToTransaccionDO(WithdrawalTO request){
        TransaccionDO transaccion = new TransaccionDO();
        transaccion.setIdTrans(null);
        transaccion.setMonto(request.getAmmount());
        transaccion.setFecha(new Date());
        transaccion.setTarDestino(null);
        transaccion.setCuentaDestino(null);
        transaccion.setClabeDes(null);
        transaccion.setNomDes(null);
        transaccion.setLocation(null);
        transaccion.setSpei(null);
        transaccion.setCuentaDO(null);
        transaccion.setTipoTransDO(null);
        transaccion.setBanco(null);

        return transaccion;
    }

}
