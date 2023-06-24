package mx.com.bbva.persistence;

import mx.com.bbva.model.CuentaBanDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaBanDAO extends JpaRepository <CuentaBanDO, Integer> {

}
