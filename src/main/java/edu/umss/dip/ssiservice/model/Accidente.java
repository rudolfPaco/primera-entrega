package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Accidente extends ModelBase {

    private String tipo;
    private Date fecha;
    private String lugar;

    @JoinTable(
            name = "EmpleadoAccidente",
            joinColumns = @JoinColumn(name = "idAccidente", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "idEmpleado", nullable = false)
    )
    @ManyToMany
    private Set<Empleado> listaEmpleados = new HashSet<>();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public Set<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Set<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    public void addEmpleado(Empleado empleado) {
        this.listaEmpleados.add(empleado);
    }
}