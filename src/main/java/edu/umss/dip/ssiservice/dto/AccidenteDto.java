package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Accidente;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class AccidenteDto extends DtoBase<Accidente> {

    private long empleadoID;
    private Date fecha;
    private String lugar;

    public long getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(long empleadoID) {
        this.empleadoID = empleadoID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public DtoBase toDto(Accidente element, ModelMapper mapper) {
        super.toDto(element, mapper);
        return this;
    }
}
