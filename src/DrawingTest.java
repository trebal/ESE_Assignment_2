import org.junit.Test;

import java.util.ArrayList;

public class DrawingTest {

    @Test
    public void getComponents() {
        ArrayList<Figure> testComponents = new ArrayList<>();
        testComponents.add(new Circle(0.0, 0.0, 1.0));
        testComponents.add(new Rectangle(0.0, 0.0, 1.0, 2.0));

        Drawing testDrawing = new Drawing(0.0, 0.0, testComponents);
    }
}
