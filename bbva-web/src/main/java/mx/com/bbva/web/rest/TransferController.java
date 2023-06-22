package mx.com.bbva.web.rest;

import io.swagger.annotations.Api;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.TransferAccountTO;
import mx.com.bbva.commons.to.TransferSpeiTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("/transfer")
@Api(value="")
public class TransferController {

    @PostMapping(value = "/account", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseTO> transferAccount(@RequestBody TransferAccountTO request) {

        //return new ResponseEntity<>(new ResponseTO(response, "message ok"), HttpStatus.OK);
        return null;
    }

    @PostMapping(value = "/spei", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseTO> transferSpei(@RequestBody TransferSpeiTO request) {
        //return new ResponseEntity<>(new ResponseTO(response, "message ok"), HttpStatus.OK);
        return null;
    }

}
