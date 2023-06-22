package mx.com.bbva.services.service;

import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.TransferAccountTO;
import mx.com.bbva.commons.to.TransferSpeiTO;

public interface TransferService {

    public ResponseTO tansferenciaC (TransferAccountTO request);
    public ResponseTO transferenciaSpei (TransferSpeiTO request);
}
