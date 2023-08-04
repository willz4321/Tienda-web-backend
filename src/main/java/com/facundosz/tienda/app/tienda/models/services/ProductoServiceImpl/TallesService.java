package com.facundosz.tienda.app.tienda.models.services.ProductoServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.facundosz.tienda.app.tienda.models.dao.IProductoDao.ITallesDao;
import com.facundosz.tienda.app.tienda.models.entity.producto.Talles;

@Service
public class TallesService implements ITallesService {

    private final ITallesDao tallesDao;

    @Autowired
    public TallesService(ITallesDao tallesDao) {
        this.tallesDao = tallesDao;
    }

    @Override
    public List<Talles> findAll() {
        return (List<Talles>) tallesDao.findAll();
    }

    @Override
    public Talles findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    @Transactional
    public Talles save(Talles item) {
        return tallesDao.save(item);
    }

    @Override
    public void dalete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dalete'");
    }

}
