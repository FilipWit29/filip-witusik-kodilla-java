package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        try {
            double x = 1.5;
            double y = 1.0;
            String result = exceptionHandling.handleException(x, y);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exception handling completed");
        }
    }
    public String handleException(double x, double y) throws  Exception {
        try {
            String result = new SecondChallenge().probablyIWillThrowException(x, y);
            return result;
        } catch (Exception e) {
            throw e;
        }
    }
}
