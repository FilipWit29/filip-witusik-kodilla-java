package com.kodilla.testing.calculator;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 3);
        int subtractResult = calculator.subtract(10, 7);

        if (addResult == 8) {
            System.out.println("Adding test ok!");
        } else {
            System.out.println("Something wrong!");
        }
        if (subtractResult == 3) {
            System.out.println("Subtraction test ok!");
        } else {
            System.out.println("Something wrong!");
        }
    }
}

