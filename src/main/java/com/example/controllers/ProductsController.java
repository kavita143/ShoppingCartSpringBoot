package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Categories;
import com.example.model.Products;
import com.example.model.Vendors;
import com.example.service.ProductsService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/products")
public class ProductsController {
	
	@Autowired
	ProductsService service;
	
	@GetMapping("")
	public List<Products> getProducts() {		
		return service.getProducts();
	}
	
	@GetMapping("/searchById/{id}")
	public Products getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/getCategories")
	public List<Categories> getCategories() {		
		return service.getCategories();
	}
	
	@GetMapping("/getVendors/{categoryId}")
	public List<Vendors> getVendors(@PathVariable int categoryId) {		
		return service.getVendors(categoryId);
	}
	
	@GetMapping("/searchByName/{name}")
	public List<Products> getProductByName(@PathVariable String name) {
		return service.getProductsByName(name);
	}
			
	@GetMapping("/getMaxProductId")
	public List<Integer> getMaxProductId() {
		return service.getMaxProductId();
	}
	
	@PostMapping("/addProduct")
	public Products addProduct(@RequestBody Products product) {
		return service.addProduct(product);
	}
	
	@PutMapping("/updateProduct/{id}")
	public Products updateProduct(@RequestBody Products product,@PathVariable int id ) {
		return service.updateProduct(product,id);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public int deleteProduct(@PathVariable int id ) {
		return service.deleteProduct(id);
	}
	
	
	
	

}
