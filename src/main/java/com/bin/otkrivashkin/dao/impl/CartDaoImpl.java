package com.bin.otkrivashkin.dao.impl;

import com.bin.otkrivashkin.dao.CartDao;
import com.bin.otkrivashkin.model.Cart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
@ResponseBody
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
}
