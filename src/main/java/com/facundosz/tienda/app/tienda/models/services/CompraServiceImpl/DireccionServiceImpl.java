package com.facundosz.tienda.app.tienda.models.services.CompraServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.facundosz.tienda.app.tienda.models.dao.ICompraDao.IDireccionDao;
import com.facundosz.tienda.app.tienda.models.entity.compra.Direccion;

@Service
public class DireccionServiceImpl implements IDireccionService {

    private final IDireccionDao direccionDao;

    public DireccionServiceImpl(IDireccionDao direccionDao) {
        this.direccionDao = direccionDao;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Direccion> findAll() {
        return (List<Direccion>) direccionDao.findAll();
    }

    @Override
    public Direccion findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    @Transactional
    public Direccion save(Direccion dir) {
        return direccionDao.save(dir);
    }

}
