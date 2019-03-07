package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.AccidenteDto;
import edu.umss.dip.ssiservice.model.Accidente;
import edu.umss.dip.ssiservice.service.AccidenteService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/accidentes")
@Produces(MediaType.APPLICATION_JSON)
public class AccidenteController extends GenericController<Accidente, AccidenteDto> {

    private AccidenteService accidenteService;

    public AccidenteController(AccidenteService accidenteService) {
        this.accidenteService = accidenteService;
    }

    @Override
    @GET
    public List<AccidenteDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return accidenteService;
    }

    @Override
    protected Accidente toModel(AccidenteDto dto) {
        Accidente accidente = super.toModel(dto);
        // recuperamos a travez del servicio de empleado al modelo empleado y lo fijamos al modelo de accidente

        return accidente;
    }
}
