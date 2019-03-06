package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
    @ManyToMany
    private Set<Empleado> listaCapacitados = new HashSet<>();


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

    public Set<Empleado> getListaCapacitados() {
        return listaCapacitados;
    }

    public void setListaCapacitados(Set<Empleado> listaCapacitados) {
        this.listaCapacitados = listaCapacitados;
    }
}
