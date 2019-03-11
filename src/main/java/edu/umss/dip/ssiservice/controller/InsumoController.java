package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.InsumoDto;
import edu.umss.dip.ssiservice.model.AsignacionInsumosEE;
import edu.umss.dip.ssiservice.model.Insumo;
import edu.umss.dip.ssiservice.service.GenericService;
import edu.umss.dip.ssiservice.service.InsumoService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/insumo")
@Produces(MediaType.APPLICATION_JSON)
public class InsumoController extends GenericController<Insumo, InsumoDto> {

    private InsumoService insumoService;
    private AsignacionInsumosEE asignacionInsumosEE;

    public InsumoController(InsumoService insumoService) {
        this.insumoService = insumoService;
    }

    @Override
    protected GenericService getService() {
        return insumoService;
    }

    @Override
    @GET
    public List<InsumoDto> getAll() {
        return super.getAll();
    }
}
