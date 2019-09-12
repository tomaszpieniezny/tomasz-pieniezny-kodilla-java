package com.kodilla.good.patterns.challenges.flightcenter;


import java.util.List;
import java.util.Map;

public class FlightApplication {
        public static void main(String[] args) {

            FlightCenter flightCenter = new FlightCenter();
            Map<Airport, List<Airport>> airportsMap = flightCenter.retrieve();
            FlightService flightService = new FlightService(airportsMap);

            Airport wroclaw = new Airport("Wroclaw");
            System.out.println("Bezpośrednie polaczenia z Wroclawia: " + flightService.findDirectConnectionsFrom(wroclaw));

            Airport gdansk = new Airport("Gdansk");
            System.out.println("\nBezposrednie polaczenia do Gdanska: " + flightService.findDirectConnectionsTo(gdansk));


            System.out.println("\nPołączenia z Gdanśka do Wrocławia: ");
            flightService.findConnectionsFromTo(gdansk, wroclaw);
        }
}

