package com.facundosz.tienda.app.tienda.models.services.ProductoServiceImpl;

import java.util.List;

import com.facundosz.tienda.app.tienda.models.entity.producto.DescripcionItem;

public interface IDescripcionItemService {

    public List<DescripcionItem> findAll();

    public DescripcionItem findById(Long id);

    public DescripcionItem save(DescripcionItem item);

    public void dalete(Long id);

}
