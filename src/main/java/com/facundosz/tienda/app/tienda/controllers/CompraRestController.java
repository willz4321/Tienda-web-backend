package com.facundosz.tienda.app.tienda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.facundosz.tienda.app.tienda.models.entity.compra.Compra;
import com.facundosz.tienda.app.tienda.models.entity.compra.Direccion;
import com.facundosz.tienda.app.tienda.models.entity.compra.ProductoCompra;
import com.facundosz.tienda.app.tienda.models.entity.producto.DescripcionItem;
import com.facundosz.tienda.app.tienda.models.entity.producto.Producto;
import com.facundosz.tienda.app.tienda.models.services.CompraServiceImpl.ICompraService;
import com.facundosz.tienda.app.tienda.models.services.CompraServiceImpl.IDireccionService;
import com.facundosz.tienda.app.tienda.models.services.ProductoServiceImpl.IDescripcionItemService;

@CrossOrigin(origins = { "http://localhost:5173" })
@RestController
@RequestMapping("/api")
public class CompraRestController {

    @Autowired
    private ICompraService compraService, productoService;

    @Autowired
    private IDescripcionItemService descripcionItemService;

    @Autowired
    private IDireccionService direccionService;

    @GetMapping("/compras")
    public List<Compra> index() {

        return compraService.findAll();

    }

    @GetMapping("/productos")
    public List<Producto> indexP() {

        return productoService.findAllP();

    }

    @GetMapping("/compras/{id}")
    public Compra show(@PathVariable Long id) {
        return compraService.findById(id);
    }

    @PostMapping("/compras")
    @ResponseStatus(HttpStatus.CREATED)
    public Compra create(@RequestBody Compra compra) {
        List<Direccion> direcciones = compra.getDirecciones();
        List<ProductoCompra> productos = compra.getProductoCompra();
        // Asignamos la compra a cada dirección
        for (Direccion direccion : direcciones) {
            direccion.setCompra(compra);
        }
        for (ProductoCompra producto : productos) {
            producto.setCompra(compra);
        }
        return compraService.save(compra);
    }

    @PutMapping("/compras/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Compra update(@RequestBody Compra compra, @PathVariable Long id) {
        Compra compraUpdate = compraService.findById(id);

        compraUpdate.setNombre(compra.getNombre());
        compraUpdate.setApellido(compra.getApellido());
        // compraUpdate.setDireccion(compra.getDireccion());
        compraUpdate.setEmail(compra.getEmail());
        compraUpdate.setTelefono(compra.getTelefono());
        compraUpdate.setTotal(compra.getTotal());

        return compraService.save(compraUpdate);
    }

    @DeleteMapping("/compras/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        compraService.dalete(id);
    }

    @PostMapping("/descripcion_items")
    @ResponseStatus(HttpStatus.CREATED)
    public DescripcionItem createDescripcionItem(@RequestBody DescripcionItem descripcionItem) {
        return descripcionItemService.save(descripcionItem);
    }

    @GetMapping("/compras/direccion")
    public List<Direccion> indexD() {

        return direccionService.findAll();

    }

    // @PostMapping("/direccion_datos")
    // @ResponseStatus(HttpStatus.CREATED)
    // public Direccion createDireccionDatos(@RequestBody Direccion dir) {
    // return direccionService.save(dir);
    // }
}
