package edu.umss.dip.ssiservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Insumo extends ModelBase {

    @Column(nullable = false)
    private String nombreInsumo;
    @Column(nullable = false)
    private int cantidad;
    private String estado;

    @OneToMany(mappedBy = "insumoAsignado")
    private Set<AsignacionInsumosEE> asignacionInsumos;

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Set<AsignacionInsumosEE> getAsignacionInsumos() {
        return asignacionInsumos;
    }

    public void setAsignacionInsumos(Set<AsignacionInsumosEE> asignacionInsumos) {
        this.asignacionInsumos = asignacionInsumos;
    }
}