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
@Table(name = "C_cliente")
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_ID_CLIENTE")
    private  Integer id;
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

    @OneToMany(mappedBy = "Cliente", cascade = CascadeType.ALL)
    private List<CuentaBanDO> cuentas;


}
