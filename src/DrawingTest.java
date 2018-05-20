import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class DrawingTest {

    @Test
    public void testComponentsAreAddedByConstructor() {
        ArrayList<Figure> testComponents = new ArrayList<>();
        testComponents.add(new Circle(0.0, 0.0, 1.0));
        testComponents.add(new Rectangle(0.0, 0.0, 1.0, 2.0));

        Drawing testDrawing = new Drawing(0.0, 0.0, testComponents);

        assertEquals(2, testDrawing.getComponents().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetComponentsReturnsUnmodifiableList()
    {
        ArrayList<Figure> testComponents = new ArrayList<>();
        testComponents.add(new Circle(0.0, 0.0, 1.0));
        testComponents.add(new Rectangle(0.0, 0.0, 1.0, 2.0));

        Drawing testDrawing = new Drawing(0.0, 0.0, testComponents);

        List<Figure> retrievedComponents = testDrawing.getComponents();
        retrievedComponents.add(new Circle(0.0, 0.0, 3.0));
    }

    //region Builder
    // New figures can be added
    @Test
    public void testBuilderAcceptNewFigures()
    {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        Circle testFigure = new Circle(0.0,0.0, 1.0);
        testDrawingBuilder.addFigure(testFigure);

        assertEquals(1, testDrawingBuilder.components.size());
    }
    // Coordinates x and y are correctly assigned
    @Test
    public void testBuilderStoresCoordinates()
    {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        Circle testFigure = new Circle(0.0,0.0, 1.0);
        testDrawingBuilder.addFigure(testFigure);
        testDrawingBuilder.set

        assertEquals(1, testDrawingBuilder.components.size());
    }
    // Should not be possible to create a Drawing without any Figure
    @Test(expected = BuilderException.class)
    public void testBuilderReturnsExceptionIfListIsEmpty()
    {
        DrawingBuilder testDrawingBuilder = new DrawingBuilder();
        Circle testFigure = new Circle(0.0,0.0, 1.0);
        testDrawingBuilder.addFigure(testFigure);
    }
    //endregion
}
