package mx.com.bbva.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "T_TRANSACCION")
@NoArgsConstructor
@AllArgsConstructor
public class TransaccionDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_ID_TRANS")
    private int idTrans;
    @ManyToOne
    @JoinColumn(name = "C_CUENTAS_BAN_PK_ID_CUENTA" , referencedColumnName = "PK_ID_CUENTA")
    private CuentaBanDO cuentaDO;
    @ManyToOne
    @JoinColumn(name = "C_TIPOS_TRANS_PK_ID_TIPO" , referencedColumnName = "PK_ID_TIPO")
    private TipoTransDO tipoTransDO;
    @Column(name = "MONTO")
    private double monto;
    @Column(name = "FECHA")
    private Date fecha;
    @Column(name = "C_DESTINO")
    private String cuentaDestino;
    @Column(name = "TARJETA_DESTINO")
    private String tarDestino;
    @Column(name = "DESTINATARIO")
    private String nomDes;
    @Column(name = "CLABE_DESTINO")
    private String clabeDes;
    @Column(name = "LOCACION")
    private String location;
    @Column(name = "SPEIS")
    private String spei;
}
