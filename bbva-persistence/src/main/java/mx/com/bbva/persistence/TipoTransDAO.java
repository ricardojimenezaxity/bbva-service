package mx.com.bbva.persistence;

import mx.com.bbva.model.CuentaBanDO;
import mx.com.bbva.model.TipoTransDO;
import mx.com.bbva.model.TransaccionDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoTransDAO extends JpaRepository<TipoTransDO, Integer> {

}
