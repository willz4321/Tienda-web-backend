package com.facundosz.tienda.app.tienda.models.dao.ICompraDao;

import org.springframework.data.repository.CrudRepository;

import com.facundosz.tienda.app.tienda.models.entity.compra.Compra;

public interface ICompraDao extends CrudRepository<Compra, Long> {

}
