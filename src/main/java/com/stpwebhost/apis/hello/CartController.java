package com.stpwebhost.apis.hello;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping
    public List<cart> getAllCarts() {
        return cartService.getAllCarts();
    }

    @GetMapping("/{id}")
    public cart getCartById(@PathVariable Long id) {
        return cartService.getCartById(id);
    }

    @PostMapping
    public cart createCart(@RequestBody cart cart) {
        return cartService.saveCart(cart);
    }

    @DeleteMapping("/{id}")
    public void deleteCart(@PathVariable Long id) {
        cartService.deleteCart(id);
    }
}
