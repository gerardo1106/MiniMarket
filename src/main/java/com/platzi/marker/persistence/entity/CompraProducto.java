package com.platzi.marker.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class CompraProducto {
    @EmbeddedId
    private CompraProductoPK idCompraProducto;
    private Integer cantidad ;
    private Double total;
    private Boolean estado;

    public CompraProductoPK getIdCompraProducto() {
        return idCompraProducto;
    }

    public void setIdCompraProducto(CompraProductoPK idCompraProducto) {
        this.idCompraProducto = idCompraProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
