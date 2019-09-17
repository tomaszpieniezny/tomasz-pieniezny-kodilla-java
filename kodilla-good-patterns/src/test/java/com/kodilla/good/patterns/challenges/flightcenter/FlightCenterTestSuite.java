package com.kodilla.good.patterns.challenges.flightcenter;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FlightCenterTestSuite {

    @Test
    public void testFindDirectConnectionsFrom() {
        //Given
        FlightCenter dataBase = new FlightCenter();
        Map<Airport, List<Airport>> airportsMap = dataBase.retrieve();
        FlightService flightSeeker = new FlightService(airportsMap);
        Airport wroclaw = new Airport("Wroclaw");
        //When
        Set<String> result = flightSeeker.findDirectConnectionsFrom(wroclaw);
        Set<String> expected = new HashSet<>();
        expected.add("Warszawa");
        expected.add("Berlin");
        expected.add("Krakow");
        expected.add("Poznan");
        expected.add("Gdansk");

        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFindDirectConnectionsTo() {
        //Given
        FlightCenter dataBase = new FlightCenter();
        Map<Airport, List<Airport>> airportsMap = dataBase.retrieve();
        FlightService flightSeeker = new FlightService(airportsMap);
        Airport gdansk = new Airport("Gdansk");
        //When
        Set<String> result = flightSeeker.findDirectConnectionsTo(gdansk);
        Set<String> expected = new HashSet<>();
        expected.add("Krakow");
        expected.add("Warszawa");
        expected.add("Wroclaw");
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFindConnectionsFromTo() {
        //Given
        FlightCenter dataBase = new FlightCenter();
        Map<Airport, List<Airport>> airportsMap = dataBase.retrieve();
        FlightService flightSeeker = new FlightService(airportsMap);
        Airport wroclaw = new Airport("Wroclaw");
        Airport gdansk = new Airport("Gdansk");
        //When
        Set<String> result = flightSeeker.findConnectionsFromTo(wroclaw, gdansk);
        Set<String> expected = new HashSet<>();
        expected.add("Warszawa");
        expected.add("Krakow");
        expected.add("Bezposrednio");
        //Then
        Assert.assertEquals(expected, result);
    }
}