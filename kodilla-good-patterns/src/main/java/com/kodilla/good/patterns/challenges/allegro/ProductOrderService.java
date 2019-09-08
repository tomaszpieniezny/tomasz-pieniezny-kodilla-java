package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface ProductOrderService {
    public boolean sold (Product product, User user, int quantity, LocalDateTime orderDate);
}
