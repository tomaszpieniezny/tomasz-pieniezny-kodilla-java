package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @Test
    public void testAddFigure() {
        //Given
        Triangle triangle = new Triangle(5.0, 2.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertEquals(1, shapeCollector.sizeFigures());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Triangle triangle = new Triangle(5.0, 2.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.sizeFigures());
    }

    @Test
    public void testShowFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Triangle(2, 3));
        shapeCollector.addFigure(new Triangle(3, 4));

        //When
        String wynik = shapeCollector.showFigures();

        //Then
        Assert.assertEquals("TriangleTriangle", wynik);
    }

    @Test
    public void testGetFigure() {
        //Given
        Triangle triangle = new Triangle(5.0, 2.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertSame(result, triangle);
    }


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

}
