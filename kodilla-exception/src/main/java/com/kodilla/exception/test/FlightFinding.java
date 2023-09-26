package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinding {
    HashMap<String, Boolean> airport;
    public FlightFinding() {
        airport = new HashMap<>();
        airport.put("Warsaw", true);
        airport.put("Cracow", true);
        airport.put("Wroclaw", true);
        airport.put("Goleniów", true);
    }

    public  void findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = flight.getArrivalAirport();

        if(airport.containsKey(arrivalAirport)) {
            System.out.println("Flight finded from: " + flight.getDepartureAirport() + " to: " + arrivalAirport);
        } else {
            throw new RouteNotFoundException("Unable to find route to airport: " + arrivalAirport);
        }
    }
}
