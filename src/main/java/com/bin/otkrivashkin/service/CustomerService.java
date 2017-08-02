package com.bin.otkrivashkin.service;

import com.bin.otkrivashkin.model.Customer;

import java.util.List;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
public interface CustomerService {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();
}
