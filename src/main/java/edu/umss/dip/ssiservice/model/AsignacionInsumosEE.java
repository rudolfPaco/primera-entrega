package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class AsignacionInsumosEE extends ModelBase {

    @ManyToOne
    @JoinColumn
    private Empleado empleadoAsignado;
    @ManyToOne
    @JoinColumn
    private Insumo insumoAsignado;

    private Date fechaAsignacion;


    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }
    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Empleado getEmpleadoAsignado() {
        return empleadoAsignado;
    }

    public void setEmpleadoAsignado(Empleado empleadoAsignado) {
        this.empleadoAsignado = empleadoAsignado;
    }

    public Insumo getInsumoAsignado() {
        return insumoAsignado;
    }

    public void setInsumoAsignado(Insumo insumoAsignado) {
        this.insumoAsignado = insumoAsignado;
    }
}