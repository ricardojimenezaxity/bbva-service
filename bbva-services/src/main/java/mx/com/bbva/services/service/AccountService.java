package mx.com.bbva.services.service;

import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.WithdrawalTO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountService {
    public BalanceTO getBalance(String accountNumber);

    public List<MovementTO> getAllMovements(String accountNumber);

    public ResponseTO createWithdrawal(WithdrawalTO withdrawalTO, Integer code);
}
