package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

@DisplayName("Tdd:Shape Collector Test Suite \uD83D\uDE32")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    private ShapeCollector shapeCollector;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        shapeCollector = new ShapeCollector();
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for adding and removing")
    class TestAddRemove {
        @Test
        @DisplayName("Adding a shape to the collection")
        void testAddFigure() {
            //Given
            Circle circle = new Circle(5.0);
            shapeCollector.addFigure(circle);

            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
        }

        @Test
        @DisplayName("Removing a shape from the collection")
        void testRemoveFigure() {
            Circle circle = new Circle(5.0);
            shapeCollector.addFigure(circle);
            shapeCollector.removeFigure(circle);

            Assertions.assertNull(shapeCollector.getFigure(0));
        }
    }
    @Nested
    @DisplayName("Tests for getting shapes")
    class TestGetFigure {

        @Test
        @DisplayName("Getting a shape by index")
        void testGetFigure() {
            Circle circle = new Circle(5.0);
            shapeCollector.addFigure(circle);

            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
        }

        @Test
        @DisplayName("Getting a shape by invalid index")
        void testGetFigureInvalid() {
            Assertions.assertNull(shapeCollector.getFigure(0));
        }
    }

    @Nested
    @DisplayName("Tests for displaying shapes")
    class TestShowFigures {

        @Test
        @DisplayName("Displaying shapes in the collection")
        void testShowFigures(){
            Circle circle = new Circle(5.0);
            Square square = new Square(20.5);
            Triangle triangle = new Triangle(6.0, 12.5);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            shapeCollector.showFigures();
        }
    }
}
