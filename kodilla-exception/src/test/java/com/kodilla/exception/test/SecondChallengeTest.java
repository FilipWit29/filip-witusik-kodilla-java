package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTest {
    @Test
    void testValidInput() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        double x = 1.0;
        double y = 2.0;
        //Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void testInvalidXValue() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        double x = 2.0;
        double y = 2.0;
        //Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void testInvalidYValue() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        double x = 1.0;
        double y = 1.5;
        //Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void testInvalidValues(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        double x = 2.0;
        double y = 1.5;
        //Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }
}
