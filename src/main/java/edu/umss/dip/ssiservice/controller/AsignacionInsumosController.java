package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.AsignacionInsumosDto;
import edu.umss.dip.ssiservice.model.AsignacionInsumosEE;
import edu.umss.dip.ssiservice.service.AsignacionInsumosEEService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import java.util.List;

@Controller
public class AsignacionInsumosController extends GenericController<AsignacionInsumosEE, AsignacionInsumosDto> {

    private AsignacionInsumosEEService asignacionInsumosEEService;

    public AsignacionInsumosController(AsignacionInsumosEEService asignacionInsumosEEService) {
        this.asignacionInsumosEEService = asignacionInsumosEEService;
    }

    @Override
    protected GenericService getService() {
        return asignacionInsumosEEService;
    }

    @Override
    @GET
    public List<AsignacionInsumosDto> getAll() {
        return super.getAll();
    }

}
