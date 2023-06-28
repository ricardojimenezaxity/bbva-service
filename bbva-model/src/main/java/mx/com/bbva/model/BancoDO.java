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
@Table(name = "C_BIN_BANCOS")
@NoArgsConstructor
@AllArgsConstructor
public class BancoDO implements Serializable {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BANCO")
    private Integer id;
    @Column(name = "PREFIJO_C")
    private String prefijoC;
    @Column(name = "PREFIJO_T")
    private String prefijoT;
    @Column(name = "BANCO")
    private String banco;
    @OneToMany(mappedBy = "banco", cascade = CascadeType.ALL)
    private List<TransaccionDO> transaccion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BancoDO)) return false;
        BancoDO bancoDO = (BancoDO) o;
        return id.equals(bancoDO.id) && prefijoC.equals(bancoDO.prefijoC) && prefijoT.equals(bancoDO.prefijoT) && banco.equals(bancoDO.banco) && transaccion.equals(bancoDO.transaccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prefijoC, prefijoT, banco, transaccion);
    }

    @Override
    public String toString() {
        return "BancoDO{" +
                "id=" + id +
                ", prefijoC='" + prefijoC + '\'' +
                ", prefijoT='" + prefijoT + '\'' +
                ", banco='" + banco + '\'' +
                ", transaccion=" + transaccion +
                '}';
    }
}
