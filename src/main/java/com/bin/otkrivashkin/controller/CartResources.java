package com.bin.otkrivashkin.controller;

import com.bin.otkrivashkin.model.Cart;
import com.bin.otkrivashkin.model.CartItem;
import com.bin.otkrivashkin.model.Customer;
import com.bin.otkrivashkin.model.Product;
import com.bin.otkrivashkin.service.CartService;
import com.bin.otkrivashkin.service.CustomerService;
import com.bin.otkrivashkin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by otkrivashkin on 02.08.2017.
 */
@Controller
@RequestMapping("rest/cart")
public class CartResources {

    @Autowired
    private CartService cartService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;

    @RequestMapping("/{cartId}")
    public @ResponseBody
    Cart getCartId(@PathVariable(value = "cartId") int cartId) {
        return cartService.getCartById(cartId);
    }

    @RequestMapping(value = "/add/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem(@PathVariable(value = "productId") int productId,
                        @AuthenticationPrincipal User activeUser) {

        Customer customer = customerService.getCustomerByUsername(activeUser.getUsername());
        Cart cart = customer.getCart();
        Product product = productService.getProductById(productId);

        List<CartItem> cartItems = cart.getCartItems();

        for (int i = 0; i < cartItems.size(); i++) {
            if (product.getId() == cartItems.get(i).getProduct().getId()) {
                CartItem cartItem = cartItems.get(i);
                cartItem.setQuantity(cartItem.getQuantity() + 1);
                cartItem.setTotalPrice(product.getPrice() * cartItem.getQuantity());
                cartItemService.addCartItem(cartItem);
            }
        }

        CartItem cartItem = new CartItem();
        cartItem.setProduct(product);
        cartItem.setQuantity(1);
        cartItem.setTotalPrice(product.getPrice() * cartItem.getQuantity());
        cartItem.setCart(cart);
        cartItemService.addCartItem(cartItem);

    }
}
