package mx.com.bbva.commons.to;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class MovementTO implements Serializable {
    private static final long serialVersionUID = 1l;

    private Date fecha;
    private String type;
    private double ammount;
    private String concept;
    private String accountNumber;
}
