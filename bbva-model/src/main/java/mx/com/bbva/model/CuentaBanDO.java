package mx.com.bbva.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

}
