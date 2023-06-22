package mx.com.bbva.services.service;

import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.commons.to.ResponseTO;

import java.util.List;

public interface AccountService {
    public BalanceTO getBalance(String accountNumber);

    public List<MovementTO> getAllMovements(String accountNumber);

    public ResponseTO getRetiro(String code);
}
