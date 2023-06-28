package mx.com.bbva.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TarjetaDO)) return false;
        TarjetaDO tarjetaDO = (TarjetaDO) o;
        return Double.compare(tarjetaDO.saldo, saldo) == 0 && idTarjeta.equals(tarjetaDO.idTarjeta) && numTarjeta.equals(tarjetaDO.numTarjeta) && vencimiento.equals(tarjetaDO.vencimiento) && cvv.equals(tarjetaDO.cvv) && status.equals(tarjetaDO.status) && cuenta.equals(tarjetaDO.cuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTarjeta, numTarjeta, vencimiento, cvv, status, saldo, cuenta);
    }

    @Override
    public String toString() {
        return "TarjetaDO{" +
                "idTarjeta=" + idTarjeta +
                ", numTarjeta='" + numTarjeta + '\'' +
                ", vencimiento=" + vencimiento +
                ", cvv=" + cvv +
                ", status='" + status + '\'' +
                ", saldo=" + saldo +
                ", cuenta=" + cuenta +
                '}';
    }
}
