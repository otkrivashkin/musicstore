package com.bin.otkrivashkin.dao.impl;

import com.bin.otkrivashkin.dao.CartDao;
import com.bin.otkrivashkin.model.Cart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
@Repository
@Transactional
public class CartDaoImpl implements CartDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Cart getCartById(int cartId) {
        Session session = sessionFactory.getCurrentSession();
        Cart cart = (Cart) session.get(Cart.class, cartId);
        session.flush();
        return cart;
    }

    @Override
    public void update(Cart cart) {
        int cartId = cart.getCartId();
        // tod
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cart);
        session.flush();
    }

    @Override
    public Cart validate(int cartId) throws IOException {
        Cart cart = getCartById(cartId);
        if (cart == null || cart.getCartItems().size() == 0) {
            throw new IOException(cartId + "");
        }
        update(cart);

        return cart;
    }
}
