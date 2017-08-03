package com.bin.otkrivashkin.service;

import com.bin.otkrivashkin.model.CustomerOrder;

/**
 * Created by otkrivashkin on 03.08.2017.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
