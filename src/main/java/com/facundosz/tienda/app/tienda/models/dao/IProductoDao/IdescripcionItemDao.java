package com.facundosz.tienda.app.tienda.models.dao.IProductoDao;

import org.springframework.data.repository.CrudRepository;

import com.facundosz.tienda.app.tienda.models.entity.producto.DescripcionItem;

public interface IdescripcionItemDao extends CrudRepository<DescripcionItem, Long> {

}
