package com.facundosz.tienda.app.tienda.models.services.ProductoServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.facundosz.tienda.app.tienda.models.dao.IProductoDao.IProductoDao;
import com.facundosz.tienda.app.tienda.models.dao.IProductoDao.IdescripcionItemDao;
import com.facundosz.tienda.app.tienda.models.entity.producto.DescripcionItem;
import com.facundosz.tienda.app.tienda.models.entity.producto.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoDao productoDao;

    @Autowired
    private IdescripcionItemDao descripcionItemRepository;

    @Autowired
    public ProductoServiceImpl(IProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Producto save(Producto Producto) {
        return productoDao.save(Producto);
    }

    @Override
    @Transactional
    public void dalete(Long id) {
        productoDao.deleteById(id);
    }

    @Override
    @Transactional
    public DescripcionItem save(DescripcionItem descripcionItem) {
        return descripcionItemRepository.save(descripcionItem);
    }

}
