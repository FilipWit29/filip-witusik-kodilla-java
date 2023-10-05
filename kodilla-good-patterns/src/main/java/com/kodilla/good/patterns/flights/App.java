package com.kodilla.good.patterns.flights;

public class App {
    public static void main(String[] args) {
        AirlineSystem airlineSystem = new AirlineSystem();

        airlineSystem.addFlight(new Flight("Gdańsk", "Warszawa"));
        airlineSystem.addFlight(new Flight("Warszawa", "Kraków"));
        airlineSystem.addFlight(new Flight("Kraków", "Wrocław"));

        System.out.println("Flights from Gdańsk: " + airlineSystem.findFlightsFromCity("Gdańsk"));
        System.out.println("Flights to Wrocław: " + airlineSystem.findFlightsToCity("Wrocław"));
        System.out.println("Flights via Kraków: " + airlineSystem.findFlightsViaCity("Kraków"));
    }
}
