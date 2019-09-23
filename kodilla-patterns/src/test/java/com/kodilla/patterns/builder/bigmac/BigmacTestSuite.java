package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void newBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("roll")
                .sauce("Standard")
                .burgers(2)
                .ingredients("Cheese")
                .ingredients("Cucamber")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
    }
}
