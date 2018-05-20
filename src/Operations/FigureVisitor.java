package Operations;

import Figures.Circle;
import Figures.Drawing;
import Figures.Rectangle;

public interface FigureVisitor {
    Circle visit(Circle circle);
    Rectangle visit(Rectangle rectangle);
    Drawing visit(Drawing drawing);
}
