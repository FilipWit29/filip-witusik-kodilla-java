package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        double additionResult = calculator.add(4, 6);
        assertEquals(10, additionResult);

        double subtractionResult = calculator.sub(10, 3);
        assertEquals(7, subtractionResult);

        double multiplicationResult = calculator.mul(5, 4);
        assertEquals(20, multiplicationResult);

        double divisionResult = calculator.div(15, 3);
        assertEquals(5, divisionResult);
    }
}
