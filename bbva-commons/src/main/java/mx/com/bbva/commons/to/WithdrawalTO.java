package mx.com.bbva.commons.to;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class WithdrawalTO implements Serializable {
    private static final long serialVersionUID = 1l;
    private String accountNumber;
    private String cardNumber;
    private String ownerName;
    private String bank;
    private double ammount;

}
