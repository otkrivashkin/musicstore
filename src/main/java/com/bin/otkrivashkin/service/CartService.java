package com.bin.otkrivashkin.service;

import com.bin.otkrivashkin.model.Cart;
import org.springframework.stereotype.Service;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
@Service
public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
