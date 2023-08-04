package com.facundosz.tienda.app.tienda.models.entity.producto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String nombre;
    private Long precio;

    @JoinColumn
    @Column(name = "descripcion")
    private String descripcion;

    @JoinColumn
    @Column(name = "talle")
    private String talle;
    private String imagen;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DescripcionItem> descripcionItems;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Talles> talles;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getDescripcion() {
        List<String> descripciones = new ArrayList<>();
        if (descripcionItems != null) {
            for (DescripcionItem descripcionItem : descripcionItems) {
                descripciones.add(descripcionItem.getItem());
            }
        }
        return descripciones;
    }

    public List<String> getTalles() {
        List<String> tallesList = new ArrayList<>();
        if (talles != null) {
            for (Talles talle : talles) {
                tallesList.add(talle.getTalle());
            }
        }
        return tallesList;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
