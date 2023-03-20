package com.example.springstore.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.springstore.data.entity.Products;


public interface ProductsRepository extends CrudRepository<Products, Integer> {
}
