package mx.com.bbva.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "C_COD_RETIRO")
@NoArgsConstructor
@AllArgsConstructor
public class CodRetiroDO implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CODIGO")
    private Integer idCodigo;
    @Column(name = "CODIGO")
    private Integer codigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodRetiroDO)) return false;
        CodRetiroDO codRetiro = (CodRetiroDO) o;
        return Objects.equals(idCodigo, codRetiro.idCodigo) && Objects.equals(codigo, codRetiro.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCodigo, codigo);
    }

    @Override
    public String toString() {
        return "CodRetiro{" +
                "idCodigo=" + idCodigo +
                ", codigo=" + codigo +
                '}';
    }
}
