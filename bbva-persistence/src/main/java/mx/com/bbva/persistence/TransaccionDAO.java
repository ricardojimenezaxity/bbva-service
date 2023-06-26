package mx.com.bbva.persistence;

import mx.com.bbva.model.TransaccionDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TransaccionDAO extends JpaRepository<TransaccionDO, Integer> {

    @Query("SELECT o FROM TransaccionDO o WHERE o.cuentaDO.idCuenta = :idCuenta") // todo en relacioncon el objeto
    List<TransaccionDO> findAllMovements(@Param("idCuenta") Integer idCuenta);
    /*
    * TransaccionDO=> obejto que reprensenta a la tabla transaccion en java
    * cuentaDO => atributo de la clase TransaccionDO que represneta la fk de la tabla
    * idCuenta => elemento a evaluar para query
    * */
}
