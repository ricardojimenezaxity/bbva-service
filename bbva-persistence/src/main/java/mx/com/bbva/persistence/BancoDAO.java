package mx.com.bbva.persistence;

import mx.com.bbva.model.BancoDO;
import mx.com.bbva.model.CodRetiroDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BancoDAO extends JpaRepository<BancoDO, Integer> {
    @Query("SELECT o FROM BancoDO o WHERE o.banco = :name")
    BancoDO findBanco(@Param("name") String name);
}
