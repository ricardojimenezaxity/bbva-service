package mx.com.bbva.persistence;

import mx.com.bbva.model.TipoTransDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoTransDAO extends JpaRepository<TipoTransDO, Integer> {
}
