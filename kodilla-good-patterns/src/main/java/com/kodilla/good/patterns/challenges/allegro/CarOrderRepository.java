package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;
import java.util.Random;

public class CarOrderRepository implements ProductOrderRepository {

    @Override
    public boolean createProductOrder(Product product, User user, int quantity, LocalDateTime orderDate) {
        return new Random().nextBoolean();
    }
}
