package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> movies = movieStore.getMovies();

        String titlesConnectedByExclamations = movies.values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.joining(" ! "));

        System.out.println(titlesConnectedByExclamations);
    }
}
