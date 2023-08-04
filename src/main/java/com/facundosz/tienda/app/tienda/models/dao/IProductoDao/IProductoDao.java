package com.facundosz.tienda.app.tienda.models.dao.IProductoDao;

import org.springframework.data.repository.CrudRepository;

import com.facundosz.tienda.app.tienda.models.entity.producto.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {

}
