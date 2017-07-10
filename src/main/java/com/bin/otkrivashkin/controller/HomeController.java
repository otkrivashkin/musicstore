package com.bin.otkrivashkin.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bin.otkrivashkin.dao.ProductDao;
import com.bin.otkrivashkin.model.Product;

@Controller
public class HomeController {

	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/productList")
	public String getProducts(Model model) {
		List<Product> products = productDao.getAllProducts();
		model.addAttribute("products", products);
		return "productList";
	}

	@RequestMapping("/productList/viewProduct/{id}")
	public String viewProduct(@PathVariable long id, Model model) throws IOException {

		Product product = productDao.getProductById(id);

		model.addAttribute(product);

		return "viewProduct";
	}
}
