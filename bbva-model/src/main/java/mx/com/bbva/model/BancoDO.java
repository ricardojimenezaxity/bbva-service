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
@Table(name = "C_cliente")
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
}
