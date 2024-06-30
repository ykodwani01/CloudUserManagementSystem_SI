package com.stpwebhost.apis.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    
    @Autowired
    private UserRepository userRepository;

    public List<cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public cart getCartById(Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    public cart saveCart(cart cart) {
        userRepository.findById(cart.getUserId()).get().addSubscription(cart.getSubscriptionModels());

        return cartRepository.save(cart);
    }
    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }
}