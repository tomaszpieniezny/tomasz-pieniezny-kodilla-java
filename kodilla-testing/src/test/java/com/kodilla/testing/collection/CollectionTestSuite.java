package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Test
    public void testOddNumberExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        evenNumbers.add(2);
        evenNumbers.add(4);
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(result,evenNumbers);
    }

    @Test
    public void testOddNumberExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean result;
        //When
        result = numbers.isEmpty();
        //Then
        Assert.assertEquals(true, result);
    }

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

}