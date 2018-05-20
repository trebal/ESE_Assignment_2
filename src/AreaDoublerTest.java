import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaDoublerTest {

    private static final double DELTA = 1e-10;
    private AreaDoubler testAreaDoubler;

    @Before
    public void initAreaDoubler() {
        testAreaDoubler = new AreaDoubler();
    }

    // Accept in circle doubles the area.
    @Test
    public void testVisitCircle() {
        Circle testCircle = new Circle(0.0, 0.0, 2.0);
        Circle doubledCircle = testCircle.accept(testAreaDoubler);
        double expected = testCircle.getA() * 2;

        assertEquals(expected, doubledCircle.getA(), DELTA);
    }

    // Accept in rectangle doubles the area.
    @Test
    public void testVisitRectangle() {
        Rectangle testRectangle = new Rectangle(0.0, 0.0, 2.0, 3.0);
        Rectangle doubledRectangle = testRectangle.accept(testAreaDoubler);
        double expected = testRectangle.getA() * 2;

        assertEquals(expected, doubledRectangle.getA(), DELTA);
    }

    // Accept in drawing doubles the area of all of its components.
    @Test
    public void testVisitDrawing() {
        ArrayList<Figure> components = new ArrayList<>();
        Circle testCircle = new Circle(0.0, 0.0, 2.0);
        components.add(testCircle);
        Drawing testDrawing = new Drawing(0.0, 0.0, components);
        testDrawing.accept(testAreaDoubler);

        List<Figure> drawingDoubledComponents = testDrawing.getComponents();
        double expected = 0.0;
        double actual = ((Circle) drawingDoubledComponents.get(0)).getA();

        assertEquals(expected, actual, DELTA);
    }
}

