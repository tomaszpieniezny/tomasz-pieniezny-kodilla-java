package com.kodilla.stream.world;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }


    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal(100000000));
        Country germany = new Country("Germany", new BigDecimal(200000000));
        Country usa = new Country("USA", new BigDecimal(300000000));
        Country canada = new Country("Canada", new BigDecimal(400000000));
        Country russia = new Country("Poland", new BigDecimal(500000000));
        Country chaina = new Country("Chaina", new BigDecimal(600000000));

        List<Country> europaList = new ArrayList<>();
        List<Country> asiaList = new ArrayList<>();
        List<Country> northAmericaList = new ArrayList<>();

        Continent Europe = new Continent("Europe", europaList);
        Continent Asia = new Continent("Asia", asiaList);
        Continent NorthAmerica = new Continent("NorthAmerica", northAmericaList);

        List<Continent> continentList = new ArrayList<>();
        continentList.add(Europe);
        continentList.add(Asia);
        continentList.add(NorthAmerica);

        //When
        europaList.add(poland);
        europaList.add(germany);
        asiaList.add(russia);
        asiaList.add(chaina);
        northAmericaList.add(usa);
        northAmericaList.add(canada);

        BigDecimal totalPeople = continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //Then
        BigDecimal expectedPeople = new BigDecimal("2100000000");
        Assert.assertEquals(expectedPeople, totalPeople);
    }

}
