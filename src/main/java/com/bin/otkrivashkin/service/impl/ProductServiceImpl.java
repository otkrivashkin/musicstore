package com.bin.otkrivashkin.service.impl;

import com.bin.otkrivashkin.dao.ProductDao;
import com.bin.otkrivashkin.model.Product;
import com.bin.otkrivashkin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProductList() {
        return null;
    }

    @Override
    public Product getProductById(int id) {
        return productDao.getProductById(id);
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void editProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }
}
