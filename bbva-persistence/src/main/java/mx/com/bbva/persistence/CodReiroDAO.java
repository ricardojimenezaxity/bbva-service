package mx.com.bbva.persistence;

import mx.com.bbva.model.CodRetiroDO;
import mx.com.bbva.model.CuentaBanDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CodReiroDAO extends JpaRepository<CodRetiroDO, Integer> {
    @Query("SELECT o FROM CodRetiroDO o WHERE o.codigo = :code")
    CodRetiroDO findCode(@Param("code") Integer code);
}
