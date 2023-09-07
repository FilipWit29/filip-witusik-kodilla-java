package com.kodilla.testing.collection;
import java.util.*;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    private static OddNumbersExterminator exterminator;

    @BeforeAll
    public static void setUp() {
        exterminator = new OddNumbersExterminator();
    }
    @DisplayName("Test odd numbers with empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> result = exterminator.exterminate(emptyList);
        assertEquals(0, result.size());
    }

    @DisplayName("Test odd numbers with normal list")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        inputList.add(5);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);

        List<Integer> result = exterminator.exterminate(inputList);
        assertEquals(expectedList, result);
    }
}