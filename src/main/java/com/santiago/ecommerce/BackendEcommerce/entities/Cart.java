package com.santiago.ecommerce.BackendEcommerce.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemCart>items;
    @OneToOne
    private User user;
    public Cart() {
        items = new ArrayList<ItemCart>();
    }
    public Cart( List<ItemCart> items, User user) {
        this.items = items;
        this.user = user;
    }
    public void addItem(ItemCart item) {
        items.add(item);
    }
    public void removeItem(ItemCart item) {
        items.remove(item);
    }
    public void cleanCart(){
        items.clear();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ItemCart> getItems() {
        return items;
    }

    public void setItems(List<ItemCart> items) {
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
