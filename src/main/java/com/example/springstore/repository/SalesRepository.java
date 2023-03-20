package com.example.springstore.repository;



import org.springframework.data.repository.CrudRepository;

import com.example.springstore.data.entity.Sales;




public interface SalesRepository extends CrudRepository<Sales, Integer> {
}