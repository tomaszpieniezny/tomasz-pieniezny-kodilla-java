package com.kodilla.testing.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StreamMainTestSuite {

    @Test
    public void beautifyReturn_ABC_jakis_tekst() {
        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        //When
        String result = poemBeautifier.beautify("ABC", text -> text + " jakis tekst");
        //Then
        Assert.assertEquals("ABC jakis tekst", result);
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }
}