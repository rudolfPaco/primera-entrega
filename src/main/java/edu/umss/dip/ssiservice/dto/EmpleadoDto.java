package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Empleado;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class EmpleadoDto extends DtoBase<Empleado> {

    private String cI;
    private String nombres;
    private String apellidos;
    private String email;
    private Date fechaContratacion;
    private int antiguedad;

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

    @Override
    public EmpleadoDto toDto(Empleado empleado, ModelMapper mapper) {
        super.toDto(empleado, mapper);
        return this;
    }
}