package com.kodilla.exception.test;

public class main {
    public static void main(String[] args) {
        FlightFinding flightFinding = new FlightFinding();

        Flight flight1 = new Flight("Warsaw", "Cracow");
        Flight flight2 = new Flight("Wroclaw","Goleniów");
        Flight flight3 = new Flight("Goleniow", "London");

        try {
            flightFinding.findFlight(flight1);
            flightFinding.findFlight(flight2);
            flightFinding.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
