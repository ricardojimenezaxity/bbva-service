package mx.com.bbva.services.facade.impl;

import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.services.facade.IaccountFacade;

import java.util.List;

public class AccountFacade implements IaccountFacade {
    @Override
    public BalanceTO getBalance(String accountNumber) {
        return this.getBalance(accountNumber);
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
