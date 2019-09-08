package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface ProductOrderRepository {
    public boolean createProductOrder(Product product, User user, int quantity, LocalDateTime orderDate);
}
