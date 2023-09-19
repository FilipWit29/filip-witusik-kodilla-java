package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(index -> System.out.println(numbers[index]));

        double average = IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .average()
                .orElse(0);

        System.out.println("Average: " + average);

        return average;
    }
}
