package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.model.Accidente;
import org.springframework.data.repository.CrudRepository;

public interface AccidenteRepository extends CrudRepository<Accidente, Long> {
}