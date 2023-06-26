package mx.com.bbva.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "T_CLIENTE")
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDO implements Serializable {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private  Integer idCliente;
    @Column(name = "NOMBRE")
    private String nombre ;
    @Column(name = "AP_PATERNO")
    private String apPaterno;
    @Column(name = "AP_MATERNO")
    private String apMaterno;
    @Column(name = "TELEFONO")
    private String tel;
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "DIRECCION")
    private String direccion;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<CuentaBanDO> cuentas;


}
