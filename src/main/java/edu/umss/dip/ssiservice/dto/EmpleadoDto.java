package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Empleado;

import java.util.Date;

public class EmpleadoDto extends DtoBase<Empleado> {
    private Long employeeId;
    private Date date;
    private String description;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*@Override
    public DtoBase toDto(AsignacionInsumosEE element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setEmployeeId(element.getInsumoAsignacion().getId());
        return this;
    }*/
}
