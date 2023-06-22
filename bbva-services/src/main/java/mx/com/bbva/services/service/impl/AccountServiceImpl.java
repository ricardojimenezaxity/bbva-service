package mx.com.bbva.services.service.impl;

import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.services.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    @Override
    public BalanceTO getBalance(String accountNumber) {

        return null;
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
