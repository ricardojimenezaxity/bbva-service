package mx.com.bbva.services.service.impl;

import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.TransferAccountTO;
import mx.com.bbva.commons.to.TransferSpeiTO;
import mx.com.bbva.model.TransaccionDO;
import mx.com.bbva.services.service.TransferService;

import javax.transaction.Transactional;
import java.util.Date;

public class TransferServiceImpl implements TransferService {
    @Override
    public ResponseTO tansferenciaC(TransferAccountTO request) {  // Ricardo


        return null;
    }

    @Override
    public ResponseTO transferenciaSpei(TransferSpeiTO request) { // Carlos
        TransaccionDO transaccion = new TransaccionDO();


        return null;
    }

    private TransaccionDO castSpeiToTransaction(TransferSpeiTO request) {
        TransaccionDO response = new TransaccionDO();
        response.setMonto(request.getAmount());
        response.setFecha(new Date());
        response.setCuentaDO(null);
        response.setTarDestino(request.getCardNumberD());
        //
      //  response.set
        return null;
    }
}
