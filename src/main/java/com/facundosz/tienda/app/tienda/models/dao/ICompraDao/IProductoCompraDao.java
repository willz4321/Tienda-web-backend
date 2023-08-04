package com.facundosz.tienda.app.tienda.models.dao.ICompraDao;

import org.springframework.data.repository.CrudRepository;

import com.facundosz.tienda.app.tienda.models.entity.compra.ProductoCompra;

public interface IProductoCompraDao extends CrudRepository<ProductoCompra, Long> {

}
