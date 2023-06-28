package mx.com.bbva.web.rest;

import io.swagger.annotations.Api;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.TransferAccountTO;
import mx.com.bbva.commons.to.TransferSpeiTO;
import mx.com.bbva.services.facade.ITransferFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("/transfer")
@Api(value="")
public class TransferController {
@Autowired
    ITransferFacade iTransferFacade;
    @PostMapping(value = "/account", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseTO> transferAccount(@RequestBody TransferAccountTO request) {
        ResponseTO response= iTransferFacade.tansferenciaC(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/spei", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseTO> transferSpei(@RequestBody TransferSpeiTO request) {
       ResponseTO response= iTransferFacade.transferenciaSpei(request);

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    // comenatario

}
