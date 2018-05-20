import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {

    private static final double DELTA = 1e-15;
    private Circle testCircle;

    @Before
    public void initCircle() {
        testCircle = new Circle(1.0, 2.0, 3.0);
    }

    @Test
    public void testGetX() {
        double expected = 1.0;
        assertEquals(expected, testCircle.getX(), DELTA);
    }

    @Test
    public void testGetY() {
        double expected = 2.0;
        assertEquals(expected, testCircle.getY(), DELTA);
    }

    @Test
    public void testGetR() {
        double expected = 3.0;
        assertEquals(expected, testCircle.getR(), DELTA);
    }
}
