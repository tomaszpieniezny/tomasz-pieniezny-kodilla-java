package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;
import java.util.Random;

public class CarOrderService implements ProductOrderService {
    @Override
    public boolean sold(Product product, User user, int quantity, LocalDateTime orderDate) {
        return new Random().nextBoolean();
    }
}
