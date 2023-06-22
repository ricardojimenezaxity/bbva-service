package mx.com.bbva.web.rest;


import io.swagger.annotations.Api;
import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.WithdrawalTO;
import org.apache.coyote.Response;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("/account")
@Api(value = "")
public class AccountController {

    @GetMapping(value = "/balance/{accountNumber}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity <List<BalanceTO>> balance(@PathVariable("accountNumber") String accountNumber) {
        return null;
    }
    @GetMapping(value = "/movements/{accountNumber}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<MovementTO>> movimientos(@PathVariable("accountNumber") String accountNumber) {
        // List<MovementTO> movimiento =
        //return new ResponseEntity<>(movimiento, HttpStatus.OK);
        return null;
    }

    @PostMapping(value = "/withdrawal/{code}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseTO> retirar(@RequestBody WithdrawalTO request, @PathVariable("code") String code) {
        //return new ResponseEntity<>(new ResponseTO(response, "message ok"), HttpStatus.OK);
        return null;
    }

}
