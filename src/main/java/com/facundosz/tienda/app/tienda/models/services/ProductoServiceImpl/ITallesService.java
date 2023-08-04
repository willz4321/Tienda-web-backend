package com.facundosz.tienda.app.tienda.models.services.ProductoServiceImpl;

import java.util.List;

import com.facundosz.tienda.app.tienda.models.entity.producto.Talles;

public interface ITallesService {

    public List<Talles> findAll();

    public Talles findById(Long id);

    public Talles save(Talles item);

    public void dalete(Long id);
}
