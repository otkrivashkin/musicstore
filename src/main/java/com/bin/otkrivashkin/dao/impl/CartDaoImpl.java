package com.bin.otkrivashkin.dao.impl;

import com.bin.otkrivashkin.dao.CartDao;
import com.bin.otkrivashkin.model.Cart;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by otkrivashkin on 18.07.2017.
 */
public class CartDaoImpl implements CartDao {

    private Map<String, Cart> listOfCarts;

    public CartDaoImpl() {
        listOfCarts = new HashMap<String, Cart>();
    }


    @Override
    public Cart create(Cart cart) {
        if (listOfCarts.keySet().contains(cart.getId())) {
            throw new IllegalArgumentException(String.format("Cannot create a cart. A cart with the given id (%) already exists", cart.getId()));
        }

        listOfCarts.put(cart.getId(), cart);

        return cart;
    }

    @Override
    public Cart read(String cartId) {
        return listOfCarts.get(cartId);
    }

    @Override
    public void update(String cartId, Cart cart) {
        if (!listOfCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Cannot update a cart. A cart with the given id (%) does not exists", cart.getId()));
        }

        listOfCarts.put(cartId, cart);
    }

    @Override
    public void delete(String cartId) {
        if (!listOfCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Cannot delete a cart with id (%), it does not exist.", cartId));
        }
        listOfCarts.remove(cartId);
    }
}
