package com.facundosz.tienda.app.tienda.models.services.CompraServiceImpl;

import java.util.List;

import com.facundosz.tienda.app.tienda.models.entity.compra.Compra;
import com.facundosz.tienda.app.tienda.models.entity.compra.Direccion;
import com.facundosz.tienda.app.tienda.models.entity.producto.Producto;

public interface ICompraService {

    public List<Compra> findAll();

    public List<Producto> findAllP();

    public Compra findById(Long id);

    public Compra save(Compra compra);

    public Direccion saved(Direccion direccion);

    public void dalete(Long id);
}
