package mx.com.bbva.commons.to;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BalanceTO implements Serializable {
    private static final long serialVersionUID = 1l;

    private double ammount;
    private String accountNumber;

}
