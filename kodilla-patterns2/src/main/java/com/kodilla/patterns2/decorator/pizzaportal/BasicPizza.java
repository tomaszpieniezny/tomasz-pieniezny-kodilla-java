package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String description() {
        return "Podstawowa pizza";
    }
}
