package mx.com.bbva.services.facade.impl;

import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.TransferAccountTO;
import mx.com.bbva.commons.to.TransferSpeiTO;
import mx.com.bbva.services.facade.ITransferFacade;
import mx.com.bbva.services.service.AccountService;
import mx.com.bbva.services.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransferFacade implements ITransferFacade {
    @Autowired
    TransferService transferService;
    @Override
    public ResponseTO tansferenciaC(TransferAccountTO request) {
        return  transferService.tansferenciaC(request);
    }

    @Override
    public ResponseTO transferenciaSpei(TransferSpeiTO request) {
       return transferService.transferenciaSpei(request);
    }
}
