package com.richtech.wk2MVC.prod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richtech.wk2MVC.prod.models.Product;
import com.richtech.wk2MVC.prod.repo.ProdRepo;

@Service
public class ProductService {
	
	@Autowired
	ProdRepo prodRepo;
	
	public List <Product> listProducts()
	{
		return prodRepo.findAll();	
	}
	
	
	public void saveProduct (Product prod) 
	{	
		prodRepo.save(prod);
	}
	
	public void deleteProduct(int id)
	{
		
		prodRepo.deleteById(id);
	}
	
	
	public Product getProduct(int id)
	{
		return prodRepo.findById(id).get();
		
	}
	
}
