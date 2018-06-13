package Operations;

import Figures.Circle;
import Figures.Drawing;
import Figures.Rectangle;

/**
 * The interface that implement any <b>operation type</b> class in order to use the Visitor pattern and visit any
 * <b>FigureOperable</b>.
 *
 * @author Ramon de Llano Chamorro
 * @version 1.1
 * @see Circle
 * @see Rectangle
 * @see Drawing
 */
public interface FigureVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Drawing drawing);
}
