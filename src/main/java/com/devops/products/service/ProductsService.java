package com.devops.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devops.products.modal.Products;
import com.devops.products.repository.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	private ProductsRepository repo;
	
	public List<Products> listAll() {
		return repo.findAll();
	}
	
	public void save(Products products) {
		repo.save(products);
	}
	
	public Products get(long id) {
		return repo.findById(id).get();
	}
	
	
	public Products updateProducts(Long id, Products products) {
		Products foundProducts = repo.findById(id).get();
		foundProducts.setName(products.getName());
		foundProducts.setBrand(products.getBrand());
		foundProducts.setMadein(products.getMadein());
		foundProducts.setPrice(products.getPrice());
		Products updatedProducts = repo.save(foundProducts);
		return updatedProducts;
	}

	public void delete(long id) {
		repo.deleteById(id);
	}

}
