package edu.umss.dip.ssiservice.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "insumos")

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getInsumos",
                procedureName = "Lista_Insumos",
                resultClasses = Insumos.class),
        @NamedStoredProcedureQuery(name = "insertInsumos",
                procedureName = "create_insumos",
                resultClasses = Insumos.class,
                parameters = {
                        @StoredProcedureParameter(
                                name = "nombreInsumo",
                                type = String.class,
                                mode = ParameterMode.IN),
                        @StoredProcedureParameter(
                                name = "cantidad",
                                type = Integer.class,
                                mode = ParameterMode.IN),
                        @StoredProcedureParameter(
                                name = "estado",
                                type = String.class,
                                mode = ParameterMode.IN)})

})
public class Insumos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreInsumo;
    private int cantidad;
    private String estado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
}
