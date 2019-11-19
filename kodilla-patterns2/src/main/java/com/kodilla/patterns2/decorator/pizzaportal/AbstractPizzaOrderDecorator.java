package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder{
    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String description() {
        return pizzaOrder.description();
    }
}
