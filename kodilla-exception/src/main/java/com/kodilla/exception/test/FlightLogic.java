package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightLogic {
    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> map = new HashMap<>();
        map.put("Warszawa", true);
        map.put("Wrocław", false);
        map.put("Poznań", false);


        String airport = flight.getArrivalAirport();
        if (map.containsKey(airport)) {
            return map.get(airport);
        } else {
            throw new RouteNotFoundException();
        }
    }
}




