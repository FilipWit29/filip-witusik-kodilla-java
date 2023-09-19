package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String name;
    private final List<Country> countries;

    public Continent(String name) {
        this.name = name;
        this.countries = new ArrayList<>();
    }

    public void addCountry (Country country) {
        countries.add(country);
    }
    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }
}
