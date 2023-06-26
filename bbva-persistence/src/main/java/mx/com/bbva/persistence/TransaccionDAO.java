package mx.com.bbva.persistence;

import mx.com.bbva.model.TransaccionDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionDAO extends JpaRepository<TransaccionDO, Integer> {
}
