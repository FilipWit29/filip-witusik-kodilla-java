package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("83000000")));
        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("India", new BigDecimal("1380000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("125700000")));
        world.addContinent(europe);
        world.addContinent(asia);
        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();
        //Then
        assertEquals(new BigDecimal("1626700000"), totalPopulation);
    }


}
