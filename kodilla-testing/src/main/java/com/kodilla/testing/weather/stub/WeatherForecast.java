package com.kodilla.testing.weather.stub;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double calculateAverageTemp() {
        Map<String, Double> temperatureData = temperatures.getTemperatures();
        double totalTemperature = 0.0;
        int count = 0;

        for (Double temperature : temperatureData.values()) {
            totalTemperature += temperature;
            count++;
        }
        if (count == 0) {
            return 0.0;
        }
        return totalTemperature / count;
    }
    public double calculateMedianTemp() {
        Map<String, Double> temperatureData = temperatures.getTemperatures();
        List<Double> temperatureValues = new ArrayList<>(temperatureData.values());

        Collections.sort(temperatureValues);
        int size = temperatureValues.size();
        if (size == 0) {
            return 0.0;
        }
        if (size % 2 != 0) {
            return temperatureValues.get(size / 2);
        }
        int middleIndex1 = (size - 1) / 2;
        int middleIndex2 = size / 2;
        double middleValue1 = temperatureValues.get(middleIndex1);
        double middleValue2 = temperatureValues.get(middleIndex2);
        return (middleValue1 + middleValue2) / 2.0;
    }
}
