package mx.com.bbva.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "C_CUENTAS_BAN")
@NoArgsConstructor
@AllArgsConstructor
public class CuentaBanDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_ID_CUENTA")
    private Integer idCuenta;

    @Column(name = "NO_CUENTA")
    private String noCuenta;

    @ManyToOne
    @JoinColumn(name = "C_cliente_PK_ID_CLIENTE" , referencedColumnName = "PK_ID_CLIENTE")
    private ClienteDO cliente;

    @OneToMany(mappedBy = "Tarjeta", cascade = CascadeType.ALL)
    private List<TarjetaDO> tarjeta;

    @Column(name = "SALDO")
    private double saldo;

    @OneToMany(mappedBy = "Transaccion", cascade = CascadeType.ALL)
    private List<TransaccionDO> transaccionDOS;

}
