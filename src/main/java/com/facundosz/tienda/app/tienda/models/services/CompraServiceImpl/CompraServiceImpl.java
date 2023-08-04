package com.facundosz.tienda.app.tienda.models.services.CompraServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.facundosz.tienda.app.tienda.models.dao.ICompraDao.ICompraDao;
import com.facundosz.tienda.app.tienda.models.dao.IProductoDao.IProductoDao;
import com.facundosz.tienda.app.tienda.models.entity.compra.Compra;
import com.facundosz.tienda.app.tienda.models.entity.compra.Direccion;
import com.facundosz.tienda.app.tienda.models.entity.producto.Producto;

@Service
public class CompraServiceImpl implements ICompraService {

    @Autowired
    private ICompraDao CompraDao;

    @Autowired
    private IProductoDao ProductoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Compra> findAll() {

        return (List<Compra>) CompraDao.findAll();
    }

    @Override
    public List<Producto> findAllP() {
        return (List<Producto>) ProductoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Compra findById(Long id) {
        return CompraDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Compra save(Compra compra) {
        return CompraDao.save(compra);
    }

    @Override
    @Transactional
    public void dalete(Long id) {
        CompraDao.deleteById(id);
    }

    @Override
    public Direccion saved(Direccion direccion) {
        // TODO Auto-generated method stub
        return null;
    }
}
