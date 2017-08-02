package com.bin.otkrivashkin.service;

import com.bin.otkrivashkin.model.CartItem;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems();
}
