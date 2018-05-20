import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class DrawingTest {

    private static final double DELTA = 1e-15;

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
}
