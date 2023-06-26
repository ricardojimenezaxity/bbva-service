package mx.com.bbva.services.service.util.factory;

import mx.com.bbva.commons.to.MovementTO;
import mx.com.bbva.model.TipoTransDO;
import mx.com.bbva.model.TransaccionDO;
import mx.com.bbva.persistence.TipoTransDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class FactoryTransacciontoTipo {
    @Autowired
    TipoTransDAO tipoTransDAO;

    public List<MovementTO> castTransactionToTipo(List<TransaccionDO> request) {
        List<MovementTO> movimientos = new ArrayList<>();

        /*

        request.forEach(e -> {
            MovementTO movimiento = new MovementTO();
            movimiento.setAccountNumber(e.getCuentaDO().getNoCuenta());
            TipoTransDO tipoTransDO = tipoTransDAO.findById(e.getTipoTransDO().getIdTipoTrans()).orElse(null);


            System.out.println(tipoTransDO.toString());
            if (tipoTransDO != null) {
                movimiento.setType(tipoTransDO.getDescripcion());
            } else {
                movimiento.setType("Tipo de transacción no encontrado");
            }
            movimiento.setFecha(e.getFecha());
            movimiento.setAmmount(e.getMonto());
            movimiento.setConcept("Sin concepto porque no está considerado en la base");
            movimientos.add(movimiento);
        });
*/
        for (TransaccionDO e:request) {
            MovementTO movimiento = new MovementTO();
            movimiento.setAccountNumber(e.getCuentaDO().getNoCuenta());
            TipoTransDO tipoTransDO = tipoTransDAO.findById(e.getTipoTransDO().getIdTipoTrans()).orElse(null);

            System.out.println(tipoTransDO.toString());
            if (tipoTransDO != null) {
                movimiento.setType(tipoTransDO.getDescripcion());
            } else {
                movimiento.setType("Tipo de transacción no encontrado");
            }
            movimiento.setFecha(e.getFecha());
            movimiento.setAmmount(e.getMonto());
            movimiento.setConcept("Sin concepto porque no está considerado en la base");
            movimientos.add(movimiento);
        }

        return movimientos;
    }

}
