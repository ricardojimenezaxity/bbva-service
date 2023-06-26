package mx.com.bbva.persistence;

import mx.com.bbva.model.CuentaBanDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CuentaBanDAO extends JpaRepository <CuentaBanDO, Integer> {
    @Query("SELECT o FROM CuentaBanDO o WHERE o.CuentaBanDO.noCuenta= :numCuenta")
    CuentaBanDO findDetailsByAccountNum(String numCuenta);
}
