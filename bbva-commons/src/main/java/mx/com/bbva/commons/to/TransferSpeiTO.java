package mx.com.bbva.commons.to;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TransferSpeiTO implements Serializable {
    private static final long serialVersionUID = 1l;
    private String ownerNameO;
    private String accountNumberO;
    private String cardNumberO;
    private double amount;
    private String ownerNameD;
    private String accountNumberD;
    private String cardNumberD;
    private String clabe;
    private String bankD;
    private String concepto;
    private String bankOrigin;
    private String speiNumberD;

}
