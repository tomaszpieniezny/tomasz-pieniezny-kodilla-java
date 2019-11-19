package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.BigDecimal;

public interface PizzaOrder {
    BigDecimal getCost();
    String description();
}
