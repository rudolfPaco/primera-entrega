package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class AsignacionInsumosEE extends ModelBase {

    @ManyToOne
    @JoinColumn
    private Empleado empleadoAsignacion;

    @ManyToOne
    @JoinColumn
    private Insumo insumoAsignacion;

    private Date fechaAsignacion;


    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
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