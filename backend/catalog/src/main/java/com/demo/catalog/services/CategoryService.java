package com.demo.catalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.catalog.models.Category;
import com.demo.catalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
}
