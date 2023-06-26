package mx.com.bbva.services.service.util.factory;

import mx.com.bbva.commons.to.BalanceTO;
import mx.com.bbva.model.CuentaBanDO;

public class FactorysCuentaDOWithBalance {

    public BalanceTO castCuentaDOtoBalanceTO(CuentaBanDO cuenta){
        BalanceTO balance = new BalanceTO();
        balance.setAccountNumber(cuenta.getNoCuenta());
        balance.setAmmount(cuenta.getSaldo());
        return balance;
    }

}
