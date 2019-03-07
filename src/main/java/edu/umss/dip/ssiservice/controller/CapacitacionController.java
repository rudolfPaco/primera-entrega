package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.CapacitacionDto;
import edu.umss.dip.ssiservice.model.Capacitacion;
import edu.umss.dip.ssiservice.service.CapacitacionService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/capacitaciones")
@Produces(MediaType.APPLICATION_JSON)
public class CapacitacionController extends GenericController<Capacitacion, CapacitacionDto> {

    private CapacitacionService service;

    public CapacitacionController(CapacitacionService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    @GET
    public List<CapacitacionDto> getAll() {
        return super.getAll();
    }
}
