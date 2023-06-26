package mx.com.bbva.persistence;

import mx.com.bbva.model.CuentaBanDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaBanDAO extends JpaRepository <CuentaBanDO, Integer> {
    @Query("SELECT o FROM CuentaBanDO o WHERE o.noCuenta = :numCuenta")
    CuentaBanDO findDetailsByAccountNum(@Param("numCuenta") String numCuenta);


}
