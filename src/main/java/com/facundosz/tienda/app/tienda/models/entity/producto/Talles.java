package com.facundosz.tienda.app.tienda.models.entity.producto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "talles")
public class Talles {

    // Relación ManyToOne con Producto
    @ManyToOne
    private Producto producto;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_talle;

    @Column(length = 500) // Ajusta la longitud según tus necesidades
    private String talle;

    // Getters y setters

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Long getId_talle() {
        return id_talle;
    }

    public void setId_talle(Long id_talle) {
        this.id_talle = id_talle;
    }

    // datos de talles
    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

}