package com.bin.otkrivashkin.dao;

import com.bin.otkrivashkin.model.Cart;

import java.io.IOException;

/**
 * Created by otkrivashkin on 18.07.2017.
 */
public interface CartDao {

    Cart getCartById(int cartId);

    void update(Cart cart);

    Cart validate(int cartId) throws IOException;
}
