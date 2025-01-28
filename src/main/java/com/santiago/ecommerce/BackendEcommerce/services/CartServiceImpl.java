package com.santiago.ecommerce.BackendEcommerce.services;

import com.santiago.ecommerce.BackendEcommerce.entities.Cart;
import com.santiago.ecommerce.BackendEcommerce.entities.ItemCart;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CartServiceImpl implements ICartService {
    @Override
    public Optional<ItemCart> addItem(Long itemId) {
        return Optional.empty();
    }

    @Override
    public Optional<ItemCart> updateQuantity(Long itemId, int quantity) {
        return Optional.empty();
    }

    @Override
    public ItemCart removeItem(ItemCart itemCart) {
        return null;
    }

    @Override
    public Optional<Cart> getCart(Long userId) {
        return Optional.empty();
    }
}
