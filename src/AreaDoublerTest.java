import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreaDoublerTest {

    private static final double DELTA = 1e-15;
    private AreaDoubler testAreaDoubler;

    @Before
    public void initAreaDoubler()
    {
        testAreaDoubler = new AreaDoubler();
    }

    @Test
    public void testVisitCircle() {
        Circle testCircle = new Circle(0.0,0.0,2.0);
        Circle doubledCircle = testCircle.accept(testAreaDoubler);

        assertEquals(expected, testCircle.getX(), DELTA);
    }
}
