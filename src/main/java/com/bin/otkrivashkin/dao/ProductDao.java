package com.bin.otkrivashkin.dao;

import java.util.ArrayList;
import java.util.List;

import com.bin.otkrivashkin.model.Product;

public class ProductDao {

	private List<Product> productList;

	public List<Product> getProductList() {

		Product prod1 = new Product();
		prod1.setName("Guitart1");
		prod1.setCategory("Instrument");
		prod1.setDescription("This is a fender strat guitar!");
		prod1.setPrice(1200);
		prod1.setCondition("new");
		prod1.setStatus("Active");
		prod1.setUnitInStock(11);
		prod1.setManufacturer("Fender");

		productList = new ArrayList<Product>();
		
		productList.add(prod1);

		return productList;
	}

}
