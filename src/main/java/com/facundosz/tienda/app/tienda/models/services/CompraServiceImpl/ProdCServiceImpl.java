package com.facundosz.tienda.app.tienda.models.services.CompraServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.facundosz.tienda.app.tienda.models.dao.ICompraDao.IProductoCompraDao;
import com.facundosz.tienda.app.tienda.models.entity.compra.ProductoCompra;

@Service
public class ProdCServiceImpl implements IProductoCompService {

    private final IProductoCompraDao productoCompraDao;

    public ProdCServiceImpl(IProductoCompraDao productoCompraDao) {
        this.productoCompraDao = productoCompraDao;
    }

    @Override
    public List<ProductoCompra> findAll() {
        return (List<ProductoCompra>) productoCompraDao.findAll();
    }

    @Override
    public ProductoCompra findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductoCompra save(ProductoCompra pc) {
        return productoCompraDao.save(pc);
    }

}
