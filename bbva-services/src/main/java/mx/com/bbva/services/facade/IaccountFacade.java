package mx.com.bbva.services.facade;

import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.commons.to.WithdrawalTO;

import java.util.List;

public interface IaccountFacade {
    public BalanceTO getBalance(String accountNumber);

    public List<MovementTO> getAllMovements(String accountNumber);

    public ResponseTO createWithdrawal(WithdrawalTO withdrawalTO, Integer code);
}
