package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ProductOrderRequest {
    private User user;
    private Product product;
    private LocalDateTime orderDate;
    private int quantity;

    public ProductOrderRequest(final User user, final Product product, final LocalDateTime orderDate, final int quantity) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public int getQuantity() {
        return quantity;
    }
}
