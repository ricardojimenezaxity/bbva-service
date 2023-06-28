package mx.com.bbva.web.rest;


import io.swagger.annotations.Api;
import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.WithdrawalTO;
import mx.com.bbva.services.facade.impl.AccountFacade;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    AccountFacade accountFacade;

    @GetMapping(value = "/balance/{accountNumber}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity <BalanceTO> balance(@PathVariable("accountNumber") String accountNumber) {
        BalanceTO balance= accountFacade.getBalance(accountNumber);
        return new ResponseEntity<>(balance, HttpStatus.OK);
    }
    @GetMapping(value = "/movements/{accountNumber}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<MovementTO>> movimientos(@PathVariable("accountNumber") String accountNumber) {
        List<MovementTO> movimientos =accountFacade.getAllMovements(accountNumber);
        return new ResponseEntity<>(movimientos, HttpStatus.OK);
    }

    @PostMapping(value = "/withdrawal/{code}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseTO> retirar(@RequestBody WithdrawalTO request, @PathVariable("code") Integer code) {
        ResponseTO response = accountFacade.createWithdrawal(request,code);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
