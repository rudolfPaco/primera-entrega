package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Insumo;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.InsumoRepository;
import org.springframework.stereotype.Service;

@Service
public class InsumoServiceImpl extends GenericServiceImpl<Insumo> implements InsumoService {

    private final InsumoRepository repository;

    public InsumoServiceImpl(InsumoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Insumo> getRepository() {
        return repository;
    }
}
