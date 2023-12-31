package com.kodilla.stream.sand;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SandStorageTestSuite {
    @Test
    void testGetSandQuantity() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Africa());
        continents.add(new Asia());
        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        for (SandStorage continent : continents) {
            totalSand = totalSand.add(continent.getSandBeanQuantity());
        }
        //Then
        BigDecimal expectedSand = new BigDecimal("1231343586920142465030433");
        assertEquals(expectedSand, totalSand);
    }

    @Test
    void testGetSandBeansQuantityWithReduce() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Africa());
        continents.add(new Asia());
        //When
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeanQuantity)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));
        //Then
        BigDecimal expectedSand = new BigDecimal("1231343586920142465030433");
        assertEquals(expectedSand, totalSand);
    }
}
