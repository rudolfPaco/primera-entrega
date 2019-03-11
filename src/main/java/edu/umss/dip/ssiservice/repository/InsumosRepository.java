package edu.umss.dip.ssiservice.repository;

import edu.umss.dip.ssiservice.model.Insumos;
import org.springframework.data.repository.CrudRepository;

public interface InsumosRepository extends CrudRepository<Insumos, Long>, InsumosRepositoryCustom {

}
