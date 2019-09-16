package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warszawa", "Warszawa");
        Flight flight2 = new Flight("Poznań", "Gdańsk");
        FlightLogic flightLogic = new FlightLogic();


        try {

            System.out.println(flight1.getArrivalAirport() + " " + flightLogic.findFilght(flight1));
            System.out.println(flight2.getArrivalAirport() + " " + flightLogic.findFilght(flight2));
        } catch (RouteNotFoundException e) {
            System.out.println("Lotnisko nie istnieje");
        }
    }
}
