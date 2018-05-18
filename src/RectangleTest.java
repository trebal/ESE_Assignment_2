import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    private static final double DELTA = 1e-15;
    private Rectangle testRectangle;

    @Before
    public void initRectangle() {
        testRectangle = new Rectangle(-1.0, 2.0, 5.0, 6.0);
    }

    @Test
    public void getX() {
        double expected = -1.0;
        assertEquals(expected, testRectangle.getX(), DELTA);
    }

    @Test
    public void getY() {
        double expected = 2.0;
        assertEquals(expected, testRectangle.getY(), DELTA);
    }

    @Test
    public void getWidth() {
        double expected = 5.0;
        assertEquals(expected, testRectangle.getWidth(), DELTA);
    }

    @Test
    public void getHeight() {
        double expected = 6.0;
        assertEquals(expected, testRectangle.getHeight(), DELTA);
    }
}
