package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Categories;
import com.example.model.Products;
import com.example.model.Vendors;
import com.example.repository.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	ProductsRepository repository;
	
	public List<Products> getProducts() {
		return repository.getProducts();
	}
	
	public Products getProductById(int id) {
		return repository.getProductById(id);
	}
	
	
	public List<Products> getProductsByName(String name) {
		return repository.getProductsByName(name);
	}

	public Products addProduct(Products product) {
		return repository.addProduct(product);
	}
	
	public List<Integer> getMaxProductId() {
		return repository.getMaxProductId();
	}
	
	public Products updateProduct(Products product,int id) {
		return repository.updateProduct(product,id);
	}
	
	public int deleteProduct(int id) {
		return repository.deleteProduct(id);
	}
	
	public List<Categories> getCategories() {		
		return repository.getCategories();
	}
	
	public List<Vendors> getVendors(int categoryId) {		
		return repository.getVendors(categoryId);
	}

}
