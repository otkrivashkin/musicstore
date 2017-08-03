package com.bin.otkrivashkin.service.impl;

import com.bin.otkrivashkin.model.Cart;
import com.bin.otkrivashkin.model.CartItem;
import com.bin.otkrivashkin.model.CustomerOrder;
import com.bin.otkrivashkin.service.CartService;
import com.bin.otkrivashkin.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by otkrivashkin on 03.08.2017.
 */
@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    @Override
    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item: cartItems) {
            grandTotal += item.getTotalPrice();
        }

        return grandTotal;
    }
}
