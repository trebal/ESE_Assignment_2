package Builders.Tests;

import Builders.BuilderException;
import Builders.DrawingBuilder;

import Figures.Circle;
import Figures.Drawing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawingBuilderTest {

    private static final double DELTA = 1e-15;

    // Builder successfully builds the object (Build with all parameters, no errors)
    @Test
    public void testBuild() throws BuilderException {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        Circle testFigure = new Circle(0.0, 0.0, 1.0);

        testDrawingBuilder.addFigure(testFigure);
        testDrawingBuilder.setX(0.0);
        testDrawingBuilder.setY(2.5);
        Drawing testDrawing = testDrawingBuilder.build();

        assertEquals(Drawing.class, testDrawing.getClass());
    }

    // New figures are added correctly
    @Test
    public void testBuilderAcceptNewFigures() throws BuilderException  {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        Circle testFigure = new Circle(0.0, 0.0, 1.0);

        testDrawingBuilder.addFigure(testFigure);
        testDrawingBuilder.setX(0.0);
        testDrawingBuilder.setY(2.5);
        Drawing testDrawing = testDrawingBuilder.build();

        assertEquals(1, testDrawing.getComponents().size());
    }

    // Coordinate y is correctly assigned
    @Test
    public void testBuilderSetX() throws BuilderException {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        Circle testFigure = new Circle(0.0, 0.0, 1.0);

        testDrawingBuilder.addFigure(testFigure);
        testDrawingBuilder.setX(1.0);
        testDrawingBuilder.setY(2.5);
        Drawing testDrawing = testDrawingBuilder.build();

        assertEquals(1.0, testDrawing.getX(), DELTA);
    }

    // Coordinate x is correctly assigned
    @Test
    public void testBuilderSetY() throws BuilderException {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        Circle testFigure = new Circle(0.0, 0.0, 1.0);

        testDrawingBuilder.addFigure(testFigure);
        testDrawingBuilder.setX(1.0);
        testDrawingBuilder.setY(2.5);
        Drawing testDrawing = testDrawingBuilder.build();

        assertEquals(2.5, testDrawing.getY(), DELTA);
    }

    // Create a Drawing with missing X coordinate throws exception
    @Test(expected = BuilderException.class)
    public void testBuilderReturnsExceptionIfXIsMissing() throws BuilderException {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        testDrawingBuilder.setX(0.1);
        testDrawingBuilder.build();
    }

    // Create a Drawing with missing X coordinate throws exception
    @Test(expected = BuilderException.class)
    public void testBuilderReturnsExceptionIfYIsMissing() throws BuilderException {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        testDrawingBuilder.setY(0.3);
        testDrawingBuilder.build();
    }

    // Create a Drawing with missing both coordinates throws exception
    @Test(expected = BuilderException.class)
    public void testBuilderReturnsExceptionIfCoordsAreMissing() throws BuilderException {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        testDrawingBuilder.build();
    }
}
