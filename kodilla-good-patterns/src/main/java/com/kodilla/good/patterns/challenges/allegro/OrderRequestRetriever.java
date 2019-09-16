package com.kodilla.good.patterns.challenges.allegro;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public ProductOrderRequest retrieve() {
        User user = new User("TomPie01", "Tomek", "Pieniezny", "tomasz.pieniezny@vp.pl");
        LocalDateTime orderDate = LocalDateTime.of(2019, 9, 8, 23, 12);
        Product product = new Car("BMW M3", "BMW M3 V8 UNIKAT STAN IDEALNY DO KOLEKCJI", new BigDecimal("187000"));
        int quantity = 1;

        System.out.println("Retrieve product request:");
        System.out.println("User: " + user.getUserName() +
                " Date: " + orderDate + "\n" +
                product + ", quantity=" + quantity);
        return new ProductOrderRequest(user, product, orderDate, quantity);
    }
}
