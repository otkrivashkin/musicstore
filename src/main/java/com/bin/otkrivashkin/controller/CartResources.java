package com.bin.otkrivashkin.controller;

import com.bin.otkrivashkin.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
@Controller
@RequestMapping("rest/cart")
public class CartResources {

    @Autowired
    private CartService cartService;

    @RequestMapping("/cartId")
    public @ResponseBody
    Cart getCartId(@PathVariable(value = "cartId") int cartId) {
        return cartService.getCartById(cartId);
    }
}
