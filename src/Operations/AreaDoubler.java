package Operations;

import Figures.Figure;
import Figures.Circle;
import Figures.Rectangle;
import Figures.Drawing;

import java.util.ArrayList;

/**
 * The class <b>Drawing</b> is an operation class used to double the area of a <b>Figure</b>.
 * It has a method <b>visit</b> for any <b>Figure</b> subclass in order to use the Visitor pattern.
 * The result is always a new scaled <b>Figure</b>.
 * This class implements the FigureVisitor interface in order to use the Visitor pattern.
 *
 * @author Ramon de Llano Chamorro
 * @version 1.0
 * @see FigureVisitor
 */
public class AreaDoubler implements FigureVisitor {

    private Figure figure;
    /**
     * The visit method for <b>Circle</b>.
     * @param circle The <b>Circle</b> to be scaled.
     * @return A new scaled <b>Circle</b>.
     */
    @Override
    public void visit(Circle circle) {
        double r = circle.getR() * Math.sqrt(2.0);

        figure = new Circle(circle.getX(), circle.getY(), r);
    }

    /**
     * The visit method for <b>Rectangle</b>.
     * @param rectangle The <b>Rectangle</b> to be scaled.
     * @return A new scaled <b>Rectangle</b>.
     */
    @Override
    public void visit(Rectangle rectangle) {
        double width = rectangle.getWidth() * Math.sqrt(2.0);
        double height = rectangle.getHeight() * Math.sqrt(2.0);

        figure = new Rectangle(rectangle.getX(), rectangle.getY(), width, height);
    }

    /**
     * The visit method for <b>Drawing</b>.
     * @param drawing The <b>Drawing</b> to be scaled. Note that opposite to other Figures, this method iterates
     *                the list of Figures and scales each one.
     * @return A new scaled <b>Drawing</b>.
     */
    @Override
    public void visit(Drawing drawing) {

        ArrayList<Figure> components = new ArrayList<>();

        for (Figure figure : drawing.getComponents()) {
            AreaDoubler areaDoubler = new AreaDoubler();
            figure.accept(areaDoubler);
            components.add(areaDoubler.getFigure());
        }

        figure = new Drawing(drawing.getX(), drawing.getY(), components);
    }

    /**
     * Returns the scaled figure contained in this <p>AreaDoubler</p>.
     * @return The scaled figure.
     */
    public Figure getFigure() {
        return figure;
    }
}
