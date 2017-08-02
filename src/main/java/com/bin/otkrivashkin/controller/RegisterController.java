package com.bin.otkrivashkin.controller;

import com.bin.otkrivashkin.model.BillingAddress;
import com.bin.otkrivashkin.model.Customer;
import com.bin.otkrivashkin.model.ShippingAddress;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String registerCustomer(Model model) {

        Customer customer = new Customer();

        BillingAddress billingAddress = new BillingAddress();
        ShippingAddress shippingAddress = new ShippingAddress();

        customer.setBillingAddres(billingAddress);
        customer.setShippingAddress(shippingAddress);

        model.addAttribute("customer", customer);

        return "registerCustomer";
    }

}
