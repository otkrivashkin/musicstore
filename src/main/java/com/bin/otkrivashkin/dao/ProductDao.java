package com.bin.otkrivashkin.dao;

import java.util.List;

import com.bin.otkrivashkin.model.Product;

public interface ProductDao {

	void addProduct(Product product);

	void editProduct(Product product);

	Product getProductById(String id);

	List<Product> getAllProducts();

	void deleteProduct(String id);
}
