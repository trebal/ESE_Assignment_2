import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {

    private static final double DELTA = 0.001;
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

    @Test
    public void testGetA() {
        double expected = 28.274;
        assertEquals(expected, testCircle.getA(), DELTA);
    }
}
