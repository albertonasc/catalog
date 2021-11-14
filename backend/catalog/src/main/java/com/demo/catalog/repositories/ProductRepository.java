package com.demo.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.catalog.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
