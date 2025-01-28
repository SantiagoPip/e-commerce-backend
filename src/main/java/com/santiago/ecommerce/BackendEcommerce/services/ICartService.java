package com.santiago.ecommerce.BackendEcommerce.services;

import com.santiago.ecommerce.BackendEcommerce.entities.Cart;
import com.santiago.ecommerce.BackendEcommerce.entities.ItemCart;

import java.util.Optional;

public interface ICartService {

    Optional<ItemCart> addItem(Long itemId);
    Optional<ItemCart> updateQuantity(Long itemId, int quantity);
    ItemCart removeItem(ItemCart itemCart);
    Optional<Cart>getCart(Long userId);

}
