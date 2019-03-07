package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.AsignacionInsumosEE;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class AsignacionInsumosDto extends DtoBase<AsignacionInsumosEE> {

    private Date fechaAsignacion;

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @Override
    public DtoBase toDto(AsignacionInsumosEE element, ModelMapper mapper) {
        super.toDto(element, mapper);
        return this;
    }
}
