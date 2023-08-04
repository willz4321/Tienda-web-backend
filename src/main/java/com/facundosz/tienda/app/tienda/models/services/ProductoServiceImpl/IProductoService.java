package com.facundosz.tienda.app.tienda.models.services.ProductoServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.facundosz.tienda.app.tienda.models.entity.producto.DescripcionItem;
import com.facundosz.tienda.app.tienda.models.entity.producto.Producto;

@Service
public interface IProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);

    public Producto save(Producto compra);

    public void dalete(Long id);

    public DescripcionItem save(DescripcionItem item);
}
