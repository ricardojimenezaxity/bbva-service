package mx.com.bbva.services.facade;

import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.TransferAccountTO;
import mx.com.bbva.commons.to.TransferSpeiTO;

public interface ITransferFacade {
    public ResponseTO tansferenciaC (TransferAccountTO request);
    public ResponseTO transferenciaSpei (TransferSpeiTO request);
}
