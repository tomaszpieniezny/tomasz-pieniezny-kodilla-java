package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.BigDecimal;

public class ExtraHamDecorator extends AbstractPizzaOrderDecorator{
    public ExtraHamDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
   @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String description() {
        return super.description() + " + extra ham";
    }
}
