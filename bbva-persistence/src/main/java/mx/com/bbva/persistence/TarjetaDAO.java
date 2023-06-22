package mx.com.bbva.persistence;

import mx.com.bbva.model.TarjetaDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetaDAO extends JpaRepository<TarjetaDO, Integer> {
}
