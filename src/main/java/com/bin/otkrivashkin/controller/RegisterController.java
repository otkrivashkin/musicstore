package com.bin.otkrivashkin.controller;

import com.bin.otkrivashkin.model.BillingAddress;
import com.bin.otkrivashkin.model.Customer;
import com.bin.otkrivashkin.model.ShippingAddress;
import com.bin.otkrivashkin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/register")
    public String registerCustomer(Model model) {

        Customer customer = new Customer();

        BillingAddress billingAddress = new BillingAddress();
        ShippingAddress shippingAddress = new ShippingAddress();

        customer.setBillingAddress(billingAddress);
        customer.setShippingAddress(shippingAddress);

        model.addAttribute("customer", customer);

        return "registerCustomer";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerCustomer(@ModelAttribute("customer") Customer customer) {

        customer.setEnabled(true);
        customerService.addCustomer(customer);

        return "registerCustomerSuccess";

    }

}
