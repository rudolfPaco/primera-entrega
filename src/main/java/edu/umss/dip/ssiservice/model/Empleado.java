package edu.umss.dip.ssiservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Empleado extends ModelBase {

    @Column(nullable = false)
    private String cI;
    @Column(nullable = false)
    private String nombres;
    @Column(nullable = false)
    private String apellidos;
    @Column(nullable = false)
    private String email;
    private Date fechaContratacion;
    @Column(nullable = false)
    private int antiguedad;

    @ManyToMany(mappedBy = "listaEmpleados")
    private Set<Accidente> accidentes = new HashSet<>();

    @ManyToMany(mappedBy = "listaCapacitados")
    private Set<Capacitacion> capacitaciones = new HashSet<>();

    @OneToMany(mappedBy = "empleadoAsignado")
    private Set<AsignacionInsumosEE> asignacionEmpleados = new HashSet<>();

    public String getcI() {
        return cI;
    }

    public void setcI(String cI) {
        this.cI = cI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Set<Accidente> getAccidentes() {
        return accidentes;
    }

    public void setAccidentes(Set<Accidente> accidentes) {
        this.accidentes = accidentes;
    }

    public Set<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(Set<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }
    public Set<AsignacionInsumosEE> getAsignacionEmpleados() {
        return asignacionEmpleados;
    }

    public void setAsignacionEmpleados(Set<AsignacionInsumosEE> asignacionEmpleados) {
        this.asignacionEmpleados = asignacionEmpleados;
    }
    public void addAccidente(Accidente accidente) {
        this.accidentes.add(accidente);
    }
    public void addCapacitacion(Capacitacion capacitacion) {
        this.capacitaciones.add(capacitacion);
    }
}