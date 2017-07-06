package com.bin.otkrivashkin.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bin.otkrivashkin.model.Product;

public class ProductDao {

	private List<Product> productList;

	public List<Product> getProductList() {

		Product product1 = new Product();
		product1.setId("one");
		product1.setName("Guitart1");
		product1.setCategory("Instrument");
		product1.setDescription("This is a fender strat guitar!");
		product1.setPrice(1200);
		product1.setCondition("new");
		product1.setStatus("Active");
		product1.setUnitInStock(11);
		product1.setManufacturer("Fender");
		
		Product product2 = new Product();
		product1.setId("two");
		product2.setName("Guitart1");
		product2.setCategory("Instrument");
		product2.setDescription("This is a fender strat guitar!");
		product2.setPrice(1200);
		product2.setCondition("new");
		product2.setStatus("Active");
		product2.setUnitInStock(11);
		product2.setManufacturer("Fender");
		
		Product product3 = new Product();
		product1.setId("three");
		product3.setName("Guitart1");
		product3.setCategory("Instrument");
		product3.setDescription("This is a fender strat guitar!");
		product3.setPrice(1200);
		product3.setCondition("new");
		product3.setStatus("Active");
		product3.setUnitInStock(11);
		product3.setManufacturer("Fender");

		productList = new ArrayList<Product>();
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);

		return productList;
	}
	
	public Product getProductById(String id) throws IOException{
		for (Product product: getProductList()) {
			if (product.getId().equals(id)) {
				return product;
			}
		}
		throw new IOException("No product found.");
	}

}
