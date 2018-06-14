package Figures;

import Operations.FigureVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The class <b>Drawing</b>, which extends the abstract class <b>Figure</b>. It is a class composed by other <b>Figures</b>
 * It has the method <b>getComponents</b> to obtain a list of the components.
 * This class is immutable and the parameters can only be obtained with getters.
 *
 * @author Ramon de Llano Chamorro
 * @version 1.1
 * @see FigureVisitor
 */
public class Drawing extends Figure {
    /**
     * A list of <b>Figure</b> components.
     */
    private final ArrayList<Figure> components;

    /**
     * The constructor of the class.
     *
     * @param x          Coordinate <p>x</p> of the superclass.
     * @param y          Coordinate <b>y</b> of the superclass.
     * @param components A list of <b>Figure</b> components.
     */
    public Drawing(double x, double y, ArrayList<Figure> components) {
        super(x, y);
        this.components = components;
    }

    // Getters

    /**
     * Returns the <b>components</b> as an <b>unmodifiableList</b>.
     *
     * @return The <b>components</b>.
     */
    public List<Figure> getComponents() {
        return Collections.unmodifiableList(components);
    }

    // Accept

    /**
     * Accepts a <b>figureVisitor</b>.
     *
     * @param figureVisitor The visitor.
     * @see FigureVisitor
     */
    @Override
    public void accept(FigureVisitor figureVisitor) {
        figureVisitor.visit(this);
    }
}
