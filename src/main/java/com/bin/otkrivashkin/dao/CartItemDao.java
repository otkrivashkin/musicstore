package com.bin.otkrivashkin.dao;

import com.bin.otkrivashkin.model.Cart;
import com.bin.otkrivashkin.model.CartItem;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
