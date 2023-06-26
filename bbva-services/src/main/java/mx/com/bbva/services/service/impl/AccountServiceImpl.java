package mx.com.bbva.services.service.impl;

import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.commons.to.ResponseTO;
import mx.com.bbva.model.CuentaBanDO;
import mx.com.bbva.persistence.CuentaBanDAO;
import mx.com.bbva.services.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.com.bbva.services.service.util.factory.FactorysCuentaDOWithBalance;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    CuentaBanDAO cuentaBanDAO;
    @Override
    public BalanceTO getBalance(String accountNumber) {
        CuentaBanDO cuenta = cuentaBanDAO.findDetailsByAccountNum(accountNumber);
        return new FactorysCuentaDOWithBalance().castCuentaDOtoBalanceTO(cuenta);
    }

    @Override
    public List<MovementTO> getAllMovements(String accountNumber) { // Serio
        return null;
    }

    @Override
    public ResponseTO getRetiro(String code) { // Juan
        return null;
    }
}
