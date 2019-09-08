package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ProductOrderDTO {
    private Product product;
    private User user;
    private LocalDateTime orderDate;
    private int quantity;
    private boolean isSuccesfullySold;

    public ProductOrderDTO(final Product product, final User user, final LocalDateTime orderDate, final int quantity, final boolean isSuccesfullySold) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.isSuccesfullySold = isSuccesfullySold;
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

    public boolean isSuccesfullySold() {
        return isSuccesfullySold;
    }
}
