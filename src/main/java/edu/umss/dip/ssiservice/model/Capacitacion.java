package edu.umss.dip.ssiservice.model;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Capacitacion extends ModelBase {


    private String titulo;
    private String tema;
    private String descripcion;
    private String lugar;
    private Date fecha;

    @JoinTable(
            name = "CapacitacionEmpleado",
            joinColumns = @JoinColumn(name = "idCapacitacion", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "idEmpleado", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Empleado> empleadosCapacitados;


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

    public List<Empleado> getEmpleadosCapacitados() {
        return empleadosCapacitados;
    }

    public void setEmpleadosCapacitados(List<Empleado> empleadosCapacitados) {
        this.empleadosCapacitados = empleadosCapacitados;
    }

    public void addEmpleadoCapacitado(Empleado empleado) {
        if (this.empleadosCapacitados.isEmpty()) {
            this.empleadosCapacitados = new LinkedList<>();
        }
        this.empleadosCapacitados.add(empleado);
    }
}
