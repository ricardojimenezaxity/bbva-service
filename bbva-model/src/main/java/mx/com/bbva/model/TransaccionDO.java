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
@Table(name = "T_TRANSACCION")
@NoArgsConstructor
@AllArgsConstructor
public class TransaccionDO implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRANS")
    private Integer idTrans;
    @ManyToOne
    @JoinColumn(name = "FK_ID_CUENTA" , referencedColumnName = "ID_CUENTA")
    private CuentaBanDO cuentaDO;
    @ManyToOne
    @JoinColumn(name = "FK_ID_TIPOTRANS" , referencedColumnName = "ID_TIPOTRANS")
    private TipoTransDO tipoTransDO;
    @Column(name = "MONTO")
    private double monto;
    @Column(name = "FECHA")
    private Date fecha;
    @Column(name = "TARJETA_DESTINO")
    private String tarDestino;
    @Column(name = "CUENTA_DESTINO")
    private String cuentaDestino;
    @Column(name = "CLABE_DESTINO")
    private String clabeDes;
    @ManyToOne
    @JoinColumn(name = "FK_ID_BANCO" , referencedColumnName = "ID_BANCO") /**/
    private BancoDO banco;
    @Column(name = "DESTINATARIO")
    private String nomDes;
    @Column(name = "LOCACION")
    private String location;
    @Column(name = "SPEI")
    private String spei;

    @Override
    public String toString() {
        return "TransaccionDO{" +
                "idTrans=" + idTrans +
                ", cuentaDO=" + cuentaDO +
                ", tipoTransDO=" + tipoTransDO +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", tarDestino='" + tarDestino + '\'' +
                ", cuentaDestino='" + cuentaDestino + '\'' +
                ", clabeDes='" + clabeDes + '\'' +
                ", banco=" + banco +
                ", nomDes='" + nomDes + '\'' +
                ", location='" + location + '\'' +
                ", spei='" + spei + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransaccionDO)) return false;
        TransaccionDO that = (TransaccionDO) o;
        return idTrans == that.idTrans && Double.compare(that.monto, monto) == 0 && cuentaDO.equals(that.cuentaDO) && tipoTransDO.equals(that.tipoTransDO) && fecha.equals(that.fecha) && tarDestino.equals(that.tarDestino) && cuentaDestino.equals(that.cuentaDestino) && clabeDes.equals(that.clabeDes) && banco.equals(that.banco) && nomDes.equals(that.nomDes) && location.equals(that.location) && spei.equals(that.spei);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTrans, cuentaDO, tipoTransDO, monto, fecha, tarDestino, cuentaDestino, clabeDes, banco, nomDes, location, spei);
    }
}
