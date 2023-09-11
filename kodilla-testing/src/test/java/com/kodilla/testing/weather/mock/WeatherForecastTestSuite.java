package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {
    @ExtendWith(MockitoExtension.class)
    @Mock
    private Temperatures temperaturesMock;
    private WeatherForecast weatherForecast;

    @BeforeEach
    void setUp() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        weatherForecast = new WeatherForecast(temperaturesMock);
    }
    @Test
    void testCalculateForecastWithMock() {
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void AverageTempTest() {
        //When
        double averageTemperature = weatherForecast.calculateAverageTemp();
        //Then
        Assertions.assertEquals(25.56, averageTemperature, 0.01);
    }

    @Test
    void MedianTempTest() {
        //When
        double medianTemperature = weatherForecast.calculateMedianTemp();
        //Then
        Assertions.assertEquals(25.5, medianTemperature, 0.01);
    }
}
