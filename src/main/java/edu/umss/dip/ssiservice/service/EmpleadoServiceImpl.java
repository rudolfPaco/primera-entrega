package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Empleado;
import edu.umss.dip.ssiservice.repositories.EmpleadoRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends GenericServiceImpl<Empleado> implements EmpleadoService {
    private final EmpleadoRepository repository;

    public EmpleadoServiceImpl(EmpleadoRepository repository) {
        this.repository = repository;
    }

    /*@Override
    public void saveImage(Long id, InputStream file) {
        Empleado empleadoPersisted = findById(id);
        try {
            Byte[] bytes = ImageUtils.inputStreamToByteArray(file);
            empleadoPersisted.setImage(bytes);
            getRepository().save(empleadoPersisted);
        } catch (IOException e) {
            logger.error("Error reading file", e);
            e.printStackTrace();
        }
    }*/

    @Override
    protected GenericRepository<Empleado> getRepository() {
        return repository;
    }
}
