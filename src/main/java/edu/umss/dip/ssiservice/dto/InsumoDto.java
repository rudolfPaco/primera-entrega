package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Insumo;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class InsumoDto extends DtoBase<Insumo> {

    private String nombreInsumo;
    private int cantidad;
    private String estado;
    private Date fechaAsignacion;

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @Override
    public InsumoDto toDto(Insumo insumo, ModelMapper mapper) {
        super.toDto(insumo, mapper);
        /*for (AsignacionInsumosEE asignacion : insumo.getAsignacionInsumos()) {
            setFechaAsignacion(asignacion.getFechaAsignacion());
        }*/
        return this;
    }
}
