package mx.com.bbva.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "C_TARJETAS")
@NoArgsConstructor
@AllArgsConstructor
public class TarjetaDO implements Serializable {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TARJETA")
    private Integer idTarjeta;
    @Column( name = "NO_TARJETA")
    private String numTarjeta;
    @Column( name = "VENCIMIENTO")
    private Date vencimiento;
    @Column( name = "CVV")
    private Integer cvv;
    @Column( name = "STATUS")
    private String status;
    @Column( name = "SALDO")
    private double saldo;

    @ManyToOne
    @JoinColumn(name = "FK_ID_CUENTA" , referencedColumnName = "ID_CUENTA")
    private CuentaBanDO cuenta;
}
