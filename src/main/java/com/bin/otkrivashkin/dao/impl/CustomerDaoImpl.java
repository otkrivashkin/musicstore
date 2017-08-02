package com.bin.otkrivashkin.dao.impl;

import com.bin.otkrivashkin.dao.CustomerDao;
import com.bin.otkrivashkin.model.Authority;
import com.bin.otkrivashkin.model.Cart;
import com.bin.otkrivashkin.model.Customer;
import com.bin.otkrivashkin.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
@Transactional
@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();

        customer.getBillingAddress().setCustomer(customer);
        customer.getShippingAddress().setCustomer(customer);

        session.saveOrUpdate(customer);
        session.saveOrUpdate(customer.getBillingAddress());
        session.saveOrUpdate(customer.getShippingAddress());

        User user = new User();
        user.setName(customer.getUserName());
        user.setPassword(customer.getPassword());
        user.setEnabled(true);
        user.setCustomerId(customer.getCustomerId());

        Authority authority = new Authority();
        authority.setUserName(customer.getUserName());
        authority.setAuthority("ROLE_USER");

        session.saveOrUpdate(user);
        session.saveOrUpdate(authority);

        Cart cart = new Cart();
        cart.setCustomer(customer);
        customer.setCart(cart);
        session.saveOrUpdate(customer);
        session.saveOrUpdate(cart);

        session.flush();
    }

    @Override
    public Customer getCustomerById(int customerId) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = (Customer) session.get(Customer.class, customerId);
        session.flush();
        return customer;
    }

    @Override
    public List<Customer> getAllCustomers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from customer");
        List<Customer> customers = query.list();
        session.flush();
        return customers;
    }
}
