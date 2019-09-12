package com.kodilla.good.patterns.challenges.flightcenter;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightCenter {
    private Map<Airport, List<Airport>> airportsMap = new HashMap<>();

    public Map<Airport, List<Airport>> retrieve() {

        Airport wroclaw = new Airport("Wroclaw");
        Airport warsaw = new Airport("Warszawa");
        Airport poznan = new Airport("Poznan");
        Airport krakow = new Airport("Krakow");
        Airport gdansk = new Airport("Gdansk");

        Airport berlin = new Airport("Berlin");
        Airport london = new Airport("Londyn");
        Airport paris = new Airport("Paryz");

        airportsMap.put(wroclaw, Arrays.asList(berlin, poznan, london, london, krakow));
        airportsMap.put(gdansk, Arrays.asList(poznan, krakow));
        airportsMap.put(krakow, Arrays.asList(wroclaw, berlin, gdansk));
        airportsMap.put(warsaw, Arrays.asList(berlin, london, gdansk));
        airportsMap.put(london, Arrays.asList(gdansk));
        airportsMap.put(london, Arrays.asList(paris));
        airportsMap.put(london, Arrays.asList(wroclaw));
        airportsMap.put(krakow, Arrays.asList(wroclaw, gdansk));
        airportsMap.put(krakow, Arrays.asList(gdansk, wroclaw));
        return airportsMap;
    }

    public Map<Airport, List<Airport>> getAirportsMap() {
        return airportsMap;
    }
}
