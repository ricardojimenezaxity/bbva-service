package mx.com.bbva.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "C_CUENTAS_BAN")
@NoArgsConstructor
@AllArgsConstructor
public class CuentaBanDO implements Serializable{


    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CUENTA")
    private Integer idCuenta;

    @Column(name = "NO_CUENTA")
    private String noCuenta;

    @ManyToOne         // hace referencia a la fk de la tabla base
    @JoinColumn(name = "FK_ID_CLIENTE" , referencedColumnName = "ID_CLIENTE") // REFRENECE HACE REFERENCIA A LA LLAVE PRIMARIA DE CLIENTE
    private ClienteDO cliente;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    private List<TarjetaDO> tarjeta;

    @Column(name = "SALDO")
    private double saldo;

    @Column(name = "VIGENCIA")
    private Date vigencia;

    @Column(name = "CLABE")
    private String clabe;

    @OneToMany(mappedBy = "cuentaDO", cascade = CascadeType.ALL)
    private List<TransaccionDO> transaccionDOS;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CuentaBanDO)) return false;
        CuentaBanDO that = (CuentaBanDO) o;
        return Double.compare(that.saldo, saldo) == 0 && idCuenta.equals(that.idCuenta) && noCuenta.equals(that.noCuenta) && cliente.equals(that.cliente) && tarjeta.equals(that.tarjeta) && vigencia.equals(that.vigencia) && clabe.equals(that.clabe) && transaccionDOS.equals(that.transaccionDOS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCuenta, noCuenta, cliente, tarjeta, saldo, vigencia, clabe, transaccionDOS);
    }

    @Override
    public String toString() {
        return "CuentaBanDO{" +
                "idCuenta=" + idCuenta +
                ", noCuenta='" + noCuenta + '\'' +
                ", cliente=" + cliente +
                ", tarjeta=" + tarjeta +
                ", saldo=" + saldo +
                ", vigencia=" + vigencia +
                ", clabe='" + clabe + '\'' +
                ", transaccionDOS=" + transaccionDOS +
                '}';
    }
}
