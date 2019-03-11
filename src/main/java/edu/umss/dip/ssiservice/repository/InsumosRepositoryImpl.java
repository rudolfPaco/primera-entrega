package edu.umss.dip.ssiservice.repository;

import edu.umss.dip.ssiservice.model.Insumos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

public class InsumosRepositoryImpl implements InsumosRepositoryCustom {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Insumos> getAllInsumos() {
        StoredProcedureQuery allInsumos = em.createNamedStoredProcedureQuery("getInsumos");
        //StoredProcedureQuery fingByAllInsumos = em.createNamedStoredProcedureQuery("getInsumos");
        return allInsumos.getResultList();
    }

    @Override
    public Insumos insertarInsumos() {
        StoredProcedureQuery allInsumos = em.createNamedStoredProcedureQuery("insertInsumos");
        allInsumos.execute();
        //StoredProcedureQuery fingByAllInsumos = em.createNamedStoredProcedureQuery("getInsumos");
        return (Insumos) allInsumos.getSingleResult();
    }
}
