package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AirlineSystem {
    List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> findFlightsFromCity(String cityName) {
        return flights.stream()
                .filter(flight -> flight.getSourceCity().equals(cityName))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsToCity(String cityName) {
        return flights.stream()
                .filter(flight -> flight.getDestinationCity().equals(cityName))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsViaCity(String viaCity) {
        return flights.stream()
                .filter(flight -> flight.getSourceCity().equals(viaCity)
                        || flight.getDestinationCity().equals(viaCity))
                .collect(Collectors.toList());
    }
}
