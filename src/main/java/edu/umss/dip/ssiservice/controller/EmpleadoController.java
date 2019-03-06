package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.EmpleadoDto;
import edu.umss.dip.ssiservice.model.Empleado;
import edu.umss.dip.ssiservice.service.EmpleadoService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class EmpleadoController extends GenericController<Empleado, EmpleadoDto> {
    private EmpleadoService service;

    public EmpleadoController(EmpleadoService service) {
        this.service = service;
    }

    @Override
    @GET
    public List<EmpleadoDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    /*@Path("/{id}/image")
    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.APPLICATION_JSON)
    public Response uploadFile(@PathParam("id") String id,
                               @FormDataParam("file") InputStream file,
                               @FormDataParam("file") FormDataContentDisposition fileDisposition) {
        service.saveImage(Long.valueOf(id), file);
        return Response.ok("Data uploaded successfully !!").build();
    }

    https://www.getpostman.com/collections/cb9764af6c5d5bcaa0c9
    */
}
