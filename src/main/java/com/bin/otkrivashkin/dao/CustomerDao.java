package com.bin.otkrivashkin.dao;

import com.bin.otkrivashkin.model.Customer;

import java.util.List;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
public interface CustomerDao {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();
}
