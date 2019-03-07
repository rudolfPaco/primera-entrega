package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.AsignacionInsumosEE;
import edu.umss.dip.ssiservice.repositories.AsignacionInsumosEERepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class AsignacionInsumosEEServiceImpl extends GenericServiceImpl<AsignacionInsumosEE> implements AsignacionInsumosEEService {

    private final AsignacionInsumosEERepository repository;

    public AsignacionInsumosEEServiceImpl(AsignacionInsumosEERepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<AsignacionInsumosEE> getRepository() {
        return repository;
    }
}
