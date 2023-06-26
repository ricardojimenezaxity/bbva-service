package mx.com.bbva.services.facade.impl;

import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.services.facade.IaccountFacade;
import mx.com.bbva.services.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AccountFacade implements IaccountFacade {
    @Autowired
    AccountService accountService;
    @Override
    public BalanceTO getBalance(String accountNumber) {
        return accountService.getBalance(accountNumber);
    }

    @Override
    public List<MovementTO> getAllMovements(String accountNumber) {
        return null;
    }

    @Override
    public ResponseTO getRetiro(String code) {
        return null;
    }
}
