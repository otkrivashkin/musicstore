package com.bin.otkrivashkin.controller;

import com.bin.otkrivashkin.model.BillingAddress;
import com.bin.otkrivashkin.model.Customer;
import com.bin.otkrivashkin.model.ShippingAddress;
import com.bin.otkrivashkin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

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
    public String registerCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "registerCustomer";
        }

        List<Customer> customers = customerService.getAllCustomers();

        for (int i = 0; i < customers.size(); i++) {
            if (customer.getCustomerEmail().equals(customers.get(i).getCustomerEmail())) {

                model.addAttribute("emailMsg", "Email already exists");

                return "registerCustomer";
            }
            if (customer.getUserName().equals(customers.get(i).getCustomerName())) {

                model.addAttribute("usernameMsg", "Username already exists");

                return "registerCustomer";
            }
        }

        customer.setEnabled(true);
        customerService.addCustomer(customer);

        return "registerCustomerSuccess";

    }

}
