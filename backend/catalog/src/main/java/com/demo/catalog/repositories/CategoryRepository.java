package com.demo.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.catalog.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
