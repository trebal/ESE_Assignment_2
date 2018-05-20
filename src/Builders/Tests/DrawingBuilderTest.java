package Builders.Tests;

import Builders.BuilderException;
import Builders.DrawingBuilder;

import Figures.Circle;
import Figures.Drawing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawingBuilderTest {

    private static final double DELTA = 1e-15;

    // New figures can be added
    @Test
    public void testBuilderAcceptNewFigures() {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        Circle testFigure = new Circle(0.0, 0.0, 1.0);
        testDrawingBuilder.addFigure(testFigure);

        assertEquals(1, testDrawingBuilder.components.size());
    }

    // Coordinate y is correctly assigned
    @Test
    public void testBuilderSetX() {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        Circle testFigure = new Circle(0.0, 0.0, 1.0);
        testDrawingBuilder.addFigure(testFigure);
        testDrawingBuilder.setX(1.0);

        assertEquals(1.0, testDrawingBuilder.x, DELTA);
    }

    // Coordinate x is correctly assigned
    @Test
    public void testBuilderSetY() {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        Circle testFigure = new Circle(0.0, 0.0, 2.0);
        testDrawingBuilder.addFigure(testFigure);
        testDrawingBuilder.setY(-1.0);

        assertEquals(-1.0, testDrawingBuilder.y, DELTA);
    }

    // Should not be possible to create a Drawing without any Figure
    @Test(expected = BuilderException.class)
    public void testBuilderReturnsExceptionIfListIsEmpty() throws BuilderException {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        testDrawingBuilder.build();
    }

    // Builder successfully builds the object
    @Test
    public void testBuild() throws BuilderException {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        Circle testFigure = new Circle(0.0, 0.0, 1.0);
        testDrawingBuilder.addFigure(testFigure);
        Drawing testDrawing = testDrawingBuilder.build();

        assertEquals(Drawing.class, testDrawing.getClass());
    }
}
