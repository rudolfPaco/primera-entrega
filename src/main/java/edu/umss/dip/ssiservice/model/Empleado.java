package edu.umss.dip.ssiservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Empleado extends ModelBase {

    private String cI;
    private String nombres;
    private String apellidos;
    private String email;
    private String fechaContratacion;
    private int antiguedad;
    @OneToMany(mappedBy = "empleadoAsignacion", fetch = FetchType.EAGER, cascade = CascadeType.ALL)

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

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public Set<AsignacionInsumosEE> getAsignacionEmpleados() {
        return asignacionEmpleados;
    }
    public void setAsignacionEmpleados(Set<AsignacionInsumosEE> asignacionEmpleados) {
        this.asignacionEmpleados = asignacionEmpleados;
    }

}