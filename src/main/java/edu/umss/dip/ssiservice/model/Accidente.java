package edu.umss.dip.ssiservice.model;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Accidente extends ModelBase {

    private String tipo;
    private String fecha;
    private String lugar;

    @JoinTable(
            name = "EmpleadoAccidente",
            joinColumns = @JoinColumn(name = "idAccidente", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "idEmpleado", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Empleado> empleadosAccidentes;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Empleado> getEmpleadosAccidentes() {
        return empleadosAccidentes;
    }

    public void setEmpleadosAccidentes(List<Empleado> empleadosAccidentes) {
        this.empleadosAccidentes = empleadosAccidentes;
    }

    public void addEmpleado(Empleado empleado) {
        if (this.empleadosAccidentes.isEmpty()) {
            empleadosAccidentes = new LinkedList<>();
        }
        this.empleadosAccidentes.add(empleado);
    }
}