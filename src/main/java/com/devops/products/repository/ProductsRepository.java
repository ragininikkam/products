package com.devops.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devops.products.modal.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {
 
}
