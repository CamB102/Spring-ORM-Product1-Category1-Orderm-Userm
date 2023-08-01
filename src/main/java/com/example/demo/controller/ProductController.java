package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

import jakarta.websocket.server.PathParam;

//ProdutController class will be configured to understand that this is the where we can get the API
@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	//return API to path /product
	@GetMapping("/products/name")
	public String getProductName() {
		return "Test product";
	}
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return productRepository.findAll();
	}
	
	//@RequestBody = payload
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		System.out.println(product.toString());
		
	}
	
	@GetMapping("/product")
	public void getIdAndName(@RequestParam int id, @RequestParam String name) {
		System.out.println(id + "-" + name);
		
	}
	
	@GetMapping("/products/{id}")
	public Product getIdFromPath(@PathVariable(value = "id") int id) {
		return productRepository.findById(id).get();
	}
	
	@GetMapping("/products/byCategory/{categoryId}")
    public List<Product> getProductsByCategoryId(@PathVariable Integer categoryId) {
        return productRepository.findByCategoriesId(categoryId);
    }
}
