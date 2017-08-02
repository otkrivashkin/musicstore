package com.bin.otkrivashkin.dao;

import com.bin.otkrivashkin.model.Cart;

/**
 * Created by otkrivashkin on 18.07.2017.
 */
public interface CartDao {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
