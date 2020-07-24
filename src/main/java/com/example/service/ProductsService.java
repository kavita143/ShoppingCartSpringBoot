package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Products;
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
	
	public List<Products> getProductByName(String name) {
		return repository.getProductByName(name);
	}

	public Products addProduct(Products product) {
		return repository.addProduct(product);
	}
	
	public Products updateProduct(Products product,int id) {
		return repository.updateProduct(product,id);
	}
	
	public int deleteProduct(int id) {
		return repository.deleteProduct(id);
	}

}
