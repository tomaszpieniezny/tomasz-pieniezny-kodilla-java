package com.kodilla.good.patterns.challenges.flightcenter;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {
    private final Map<Airport, List<Airport>> airportsMap;

    public FlightService(Map<Airport, List<Airport>> airportsMap) {
        this.airportsMap = airportsMap;
    }

    public Set<String> findDirectConnectionsFrom(Airport airport) {
        return airportsMap.get(airport).stream()
                .map(x -> x.getAirportName())
                .collect(Collectors.toSet());
    }

    public Set<String> findDirectConnectionsTo(Airport airport) {
        return airportsMap.entrySet().stream()
                .filter(x -> x.getValue().contains(airport))
                .map(entry -> entry.getKey())
                .map(x -> x.getAirportName())
                .collect(Collectors.toSet());
    }

    public Set<String> findConnectionsFromTo(Airport airportFrom, Airport airportTo) {
        Set<String> result = new HashSet<>();

        List<String> list1 = airportsMap.entrySet().stream()
                .filter(x -> x.getValue().contains(airportTo))
                .map(Map.Entry::getKey)
                .map(x -> x.getAirportName())
                .collect(Collectors.toList());

        List<String> list2 = airportsMap.get(airportFrom).stream()
                .map(s -> s.getAirportName())
                .collect(Collectors.toList());

        for (String list : list2) {
            if (list.contains(airportTo.getAirportName())) {
                result.add("Bezposrednio");
            } else if (list1.contains(list)) {
                result.add(list);
            }
        }
        return result;
    }
}
