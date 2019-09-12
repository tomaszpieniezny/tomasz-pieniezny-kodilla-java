package com.kodilla.good.patterns.challenges.flightcenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Airport {
    private final String airportName;
    private List<Airport> connections = new ArrayList<>();

    public Airport(String name) {
        this.airportName = name;
    }

    public void addConnections(Airport airport) {
        connections.addAll(Arrays.asList(airport));
    }

    public String getAirportName() {
        return airportName;
    }

    public List<Airport> getConnections() {
        return connections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(airportName, airport.airportName) &&
                Objects.equals(connections, airport.connections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportName, connections);
    }
}
