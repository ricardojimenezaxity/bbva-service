package mx.com.bbva.services.service.util.factory;

import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.model.TipoTransDO;
import mx.com.bbva.model.TransaccionDO;
import mx.com.bbva.persistence.TipoTransDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FactoryTransacciontoTipo {
    @Autowired
    TipoTransDAO tipoTransDAO;

    public MovementTO castTransactionToTipo(TransaccionDO e) {
            MovementTO movimiento = new MovementTO();
            movimiento.setAccountNumber(e.getCuentaDO().getNoCuenta());
            movimiento.setFecha(e.getFecha());
            movimiento.setAmmount(e.getMonto());
            movimiento.setConcept("Sin concepto porque no está considerado en la base");
            movimiento.setType("");
        return movimiento;
    }

}
