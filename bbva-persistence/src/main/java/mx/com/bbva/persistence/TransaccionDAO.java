package mx.com.bbva.persistence;

import mx.com.bbva.model.TransaccionDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionDAO extends JpaRepository<TransaccionDO, Integer> {
}
