package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.productos.models.dao.ProductoDao;
import com.formacionbdi.springboot.app.productos.models.entity.Producto;


@Service
public class ProductoServiceIMpl implements IProductosService{
	
	
	@Autowired
	private ProductoDao prodDao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		
		
		
		return (List<Producto>) prodDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)

	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return prodDao.findById(id).orElse(null);
	}
	
	

}
