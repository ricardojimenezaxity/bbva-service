package mx.com.bbva.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClienteDO)) return false;
        ClienteDO clienteDO = (ClienteDO) o;
        return idCliente.equals(clienteDO.idCliente) && nombre.equals(clienteDO.nombre) && apPaterno.equals(clienteDO.apPaterno) && apMaterno.equals(clienteDO.apMaterno) && tel.equals(clienteDO.tel) && correo.equals(clienteDO.correo) && direccion.equals(clienteDO.direccion) && cuentas.equals(clienteDO.cuentas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombre, apPaterno, apMaterno, tel, correo, direccion, cuentas);
    }

    @Override
    public String toString() {
        return "ClienteDO{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apPaterno='" + apPaterno + '\'' +
                ", apMaterno='" + apMaterno + '\'' +
                ", tel='" + tel + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
