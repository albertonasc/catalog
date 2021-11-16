package com.demo.catalog.tests;

import java.time.Instant;

import com.demo.catalog.dto.ProductDTO;
import com.demo.catalog.models.Category;
import com.demo.catalog.models.Product;

public class Factory {
	
	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2020-10-21T04:00:00Z"));
		product.getCategories().add(createCategory());
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
	
	public static Category createCategory() {
		return new Category(2L, "Electronics");
	}
	
}
