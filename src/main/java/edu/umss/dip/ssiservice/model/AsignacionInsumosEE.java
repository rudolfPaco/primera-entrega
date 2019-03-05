package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AsignacionInsumosEE extends ModelBase {

    @ManyToOne
    @JoinColumn
    private Empleado empleadoAsignacion;
    @ManyToOne
    @JoinColumn
    private Insumo insumoAsignacion;
    private String fechaAsignacion;

    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
    public Empleado getEmpleadoAsignacion() {
        return empleadoAsignacion;
    }
    public void setEmpleadoAsignacion(Empleado empleadoAsignacion) {
        this.empleadoAsignacion = empleadoAsignacion;
    }
    public Insumo getInsumoAsignacion() {
        return insumoAsignacion;
    }
    public void setInsumoAsignacion(Insumo insumoAsignacion) {
        this.insumoAsignacion = insumoAsignacion;
    }
}