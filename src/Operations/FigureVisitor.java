package Operations;

import Figures.Circle;
import Figures.Drawing;
import Figures.Rectangle;

/**
 * The interface that implement any <b>operation type</b> class in order to use the Visitor pattern and visit any
 * <b>FigureOperable</b>.
 *
 * @author Ramon de Llano Chamorro
 * @version 1.0
 * @see Figures.FigureOperable
 * @see Circle
 * @see Rectangle
 * @see Drawing
 */
public interface FigureVisitor {
    Circle visit(Circle circle);
    Rectangle visit(Rectangle rectangle);
    Drawing visit(Drawing drawing);
}
