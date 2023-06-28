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
@Table(name = "C_TIPOS_TRANS")
@NoArgsConstructor
@AllArgsConstructor
public class TipoTransDO implements Serializable {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPOTRANS")
    private Integer idTipoTrans;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(mappedBy = "tipoTransDO", cascade = CascadeType.ALL) /**/
    private List<TransaccionDO> transaccion;

    @Override
    public String toString() {
        return "TipoTransDO{" +
                "idTipoTrans=" + idTipoTrans +
                ", descripcion='" + descripcion + '\'' +
                ", transaccion=" + transaccion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoTransDO)) return false;
        TipoTransDO that = (TipoTransDO) o;
        return idTipoTrans == that.idTipoTrans && descripcion.equals(that.descripcion) && transaccion.equals(that.transaccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoTrans, descripcion, transaccion);
    }

}
