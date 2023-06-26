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
@Table(name = "T_TRANSACCION")
@NoArgsConstructor
@AllArgsConstructor
public class TransaccionDO implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRANS")
    private int idTrans;
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
}
