package com.facundosz.tienda.app.tienda.models.services.CompraServiceImpl;

import java.util.List;

import com.facundosz.tienda.app.tienda.models.entity.compra.Direccion;

public interface IDireccionService {

    public List<Direccion> findAll();

    public Direccion findById(Long id);

    public Direccion save(Direccion dir);

    public void delete(Long id);
}
