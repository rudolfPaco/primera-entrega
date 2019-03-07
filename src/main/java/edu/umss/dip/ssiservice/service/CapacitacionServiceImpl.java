package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Capacitacion;
import edu.umss.dip.ssiservice.repositories.CapacitacionRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class CapacitacionServiceImpl extends GenericServiceImpl<Capacitacion> implements CapacitacionService {

    private final CapacitacionRepository repository;

    public CapacitacionServiceImpl(CapacitacionRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Capacitacion> getRepository() {
        return repository;
    }
}
