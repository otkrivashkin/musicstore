package com.bin.otkrivashkin.dao;

import com.bin.otkrivashkin.model.CustomerOrder;

/**
 * Created by otkrivashkin on 03.08.2017.
 */
public interface CustomerOrderDao {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
