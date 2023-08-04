package com.facundosz.tienda.app.tienda.models.services.CompraServiceImpl;

import java.util.List;

import com.facundosz.tienda.app.tienda.models.entity.compra.ProductoCompra;

public interface IProductoCompService {

    List<ProductoCompra> findAll();

    public ProductoCompra findById(Long id);

    public ProductoCompra save(ProductoCompra dir);

}
