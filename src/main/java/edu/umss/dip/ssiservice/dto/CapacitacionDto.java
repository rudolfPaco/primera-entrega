package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Capacitacion;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class CapacitacionDto extends DtoBase<Capacitacion> {

    private String titulo;
    private String tema;
    private String descripcion;
    private String lugar;
    private Date fecha;
    private long empleadoID;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(long empleadoID) {
        this.empleadoID = empleadoID;
    }

    @Override
    public CapacitacionDto toDto(Capacitacion capacitacion, ModelMapper mapper) {
        super.toDto(capacitacion, mapper);
        /*for (Empleado empleado : capacitacion.getListaCapacitados()) {
            setEmpleadoID(empleado.getId());
        }*/
        return this;
    }
}
