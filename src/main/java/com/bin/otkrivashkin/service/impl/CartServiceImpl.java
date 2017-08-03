package com.bin.otkrivashkin.service.impl;

import com.bin.otkrivashkin.dao.CartDao;
import com.bin.otkrivashkin.model.Cart;
import com.bin.otkrivashkin.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Override
    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

    @Override
    public void update(Cart cart) {
        cartDao.update(cart);
    }
}
