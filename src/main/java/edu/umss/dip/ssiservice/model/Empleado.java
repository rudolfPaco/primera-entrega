package edu.umss.dip.ssiservice.model;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "cI")})
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

    @ManyToMany(mappedBy = "empleadosAccidentes")
    private List<Accidente> accidentes;

    @ManyToMany(mappedBy = "empleadosCapacitados")
    private List<Capacitacion> capacitaciones;

    @OneToMany(mappedBy = "empleadoAsignacion", cascade = CascadeType.ALL)
    private Set<AsignacionInsumosEE> asignacionEmpleados;


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

    public List<Accidente> getAccidentes() {
        return accidentes;
    }

    public void setAccidentes(List<Accidente> accidentes) {
        this.accidentes = accidentes;
    }

    public List<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(List<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    public Set<AsignacionInsumosEE> getAsignacionEmpleados() {
        return asignacionEmpleados;
    }

    public void setAsignacionEmpleados(Set<AsignacionInsumosEE> asignacionEmpleados) {
        this.asignacionEmpleados = asignacionEmpleados;
    }

    public void addAccidente(Accidente accidente) {
        if (this.accidentes.isEmpty()) {
            this.accidentes = new LinkedList<>();
        }
        this.accidentes.add(accidente);
    }

    public void addCapacitacion(Capacitacion capacitacion) {
        if (this.capacitaciones.isEmpty()) {
            this.capacitaciones = new LinkedList<>();
        }
        this.capacitaciones.add(capacitacion);
    }

}