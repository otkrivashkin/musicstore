package com.bin.otkrivashkin.controller;

import com.bin.otkrivashkin.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by otkrivashkin on 01.08.2017.
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/productList")
    public String getProducts(Model model) {
        List<Product> products = productService.getProductList();
        model.addAttribute("products", products);

        return "productList";
    }
}
