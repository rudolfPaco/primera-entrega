package edu.umss.dip.ssiservice.repository;

import edu.umss.dip.ssiservice.model.Insumos;

import java.util.List;

public interface InsumosRepositoryCustom {

    List<Insumos> getAllInsumos();

    Insumos insertarInsumos();
}
