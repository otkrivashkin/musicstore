package com.bin.otkrivashkin.controller;

import com.bin.otkrivashkin.model.Customer;
import com.bin.otkrivashkin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
@Controller
@RequestMapping("/customer/cart")
public class CartController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping
    public String getCart(@AuthenticationPrincipal User activeUser) {
        Customer customer = customerService.getCustomerByUsername(activeUser.getUsername());
    }
}
