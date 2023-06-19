package mx.com.bbva.services.facade.impl;

import mx.com.bbva.commons.to.UserTO;
import mx.com.bbva.services.facade.IbbvaFacade;
import mx.com.bbva.services.service.IbbvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class bbvaFacade implements IbbvaFacade {

    @Autowired
    private IbbvaService bbvaService;

    public List<UserTO> getAllUsers() {
        return this.bbvaService.getUsers();
    }
}
