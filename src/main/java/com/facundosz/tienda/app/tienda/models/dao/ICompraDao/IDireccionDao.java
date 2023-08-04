package com.facundosz.tienda.app.tienda.models.dao.ICompraDao;

import org.springframework.data.repository.CrudRepository;

import com.facundosz.tienda.app.tienda.models.entity.compra.Direccion;

public interface IDireccionDao extends CrudRepository<Direccion, Long> {

}
