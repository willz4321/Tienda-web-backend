package com.facundosz.tienda.app.tienda.models.services.ProductoServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.facundosz.tienda.app.tienda.models.dao.IProductoDao.IdescripcionItemDao;
import com.facundosz.tienda.app.tienda.models.entity.producto.DescripcionItem;

@Service
public class DescripcionItemService implements IDescripcionItemService {

    private final IdescripcionItemDao descripcionItemDao;

    @Autowired
    public DescripcionItemService(IdescripcionItemDao descripcionItemDao) {
        this.descripcionItemDao = descripcionItemDao;
    }

    @Override
    public void dalete(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<DescripcionItem> findAll() {
        return (List<DescripcionItem>) descripcionItemDao.findAll();
    }

    @Override
    public DescripcionItem findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    @Transactional
    public DescripcionItem save(DescripcionItem item) {
        return descripcionItemDao.save(item);
    }

}
