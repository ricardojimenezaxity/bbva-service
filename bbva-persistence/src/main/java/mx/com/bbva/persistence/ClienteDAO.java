package mx.com.bbva.persistence;

import mx.com.bbva.model.ClienteDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDAO extends JpaRepository <ClienteDO, Integer> {
}
