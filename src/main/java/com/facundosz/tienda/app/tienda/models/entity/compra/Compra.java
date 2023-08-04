package com.facundosz.tienda.app.tienda.models.entity.compra;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "compra")
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long telefono;
    private Long total;
    private String nombre;
    private String apellido;
    private String email;

    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Direccion> direcciones;

    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<ProductoCompra> productoCompra;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTelefono() {
        return telefono;
    }

    public Long getTotal() {
        return total;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Direccion> getDirecciones() {
        if (direcciones == null) {
            direcciones = new ArrayList<>();
        }
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direccionDatos) {
        this.direcciones = direccionDatos;
        // Establece la relación bidireccional entre Compra y Direccion
        for (Direccion direccion : direccionDatos) {
            direccion.setCompra(this);
        }
    }

    public List<ProductoCompra> getProductoCompra() {
        if (productoCompra == null) {
            productoCompra = new ArrayList<>();
        }
        return productoCompra;
    }

    public void setProductoCompra(List<ProductoCompra> productoCompra) {
        this.productoCompra = productoCompra;
        // Establece la relación bidireccional entre Compra y Direccion
        for (ProductoCompra producto : productoCompra) {
            producto.setCompra(this);
        }
    }
}
