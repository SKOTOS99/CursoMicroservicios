package com.formacionbdi.springboot.app.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.service.IProductosService;

@RestController
public class ProductoController {
	
	@Autowired
	private IProductosService prodServ;

	@GetMapping("/listar")
	public List<Producto> listar(){
		return prodServ.findAll();
		
	}
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		return prodServ.findById(id);
	}
}
