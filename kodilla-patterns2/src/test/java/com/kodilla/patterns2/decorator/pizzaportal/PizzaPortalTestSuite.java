package com.kodilla.patterns2.decorator.pizzaportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaPortalTestSuite {
    @Test
    public void basicWithDoubleCheese(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        System.out.println(cost);
        String description = pizzaOrder.description();
        System.out.println(description);
        //Then
        assertEquals(new BigDecimal(25), cost);
        assertEquals("Podstawowa pizza + extra cheese + extra cheese", description);
    }
    @Test
    public void basicWithHamAndCheese(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraHamDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        System.out.println(cost);
        String description = pizzaOrder.description();
        System.out.println(description);
        //Then
        assertEquals(new BigDecimal(23), cost);
        assertEquals("Podstawowa pizza + extra ham + extra cheese", description);
    }
}
