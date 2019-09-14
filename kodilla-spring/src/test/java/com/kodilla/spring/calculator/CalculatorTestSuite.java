package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
                Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(2,2);
        double resultSub = calculator.sub(2,2);
        double resultMul = calculator.mul(2,2);
        double resultDiv = calculator.div(2,2);
        //Then
        Assert.assertEquals(4,resultAdd,1);
        Assert.assertEquals(0,resultSub,1);
        Assert.assertEquals(4,resultMul,1);
        Assert.assertEquals(1,resultDiv,1);
    }
}
