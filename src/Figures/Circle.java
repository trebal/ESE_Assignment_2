package Figures;

import Operations.FigureVisitor;

/**
 * The class <b>Circle</b>, which extends the abstract class <b>Figure</b>.
 * It has the methods <b>getR</b> for obtaining the radius and <b>getA</b> for calculate the area.
 * This class is immutable and the parameters can only be obtained with getters.
 * This class implements the FigureOperable interface in order to use the Visitor pattern.
 *
 * @author Ramon de Llano Chamorro
 * @version 1.0
 * @see FigureOperable
 * @see FigureVisitor
 */
public class Circle extends Figure {
    /**
     * The <b>radius</b> of the Circle.
     */
    private final double r;

    /**
     * The constructor of the class.
     *
     * @param x Coordinate <p>x</p> of the superclass.
     * @param y Coordinate <b>y</b> of the superclass.
     * @param r The <b>radius</b> of the Circle.
     */
    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    //region Getters

    /**
     * Returns the <b>radius</b> of the Circle.
     *
     * @return The <b>radius</b>.
     */
    public double getR() {
        return r;
    }

    /**
     * Calculates and returns the <b>area</b> of the Circle.
     *
     * @return The <b>area</b>.
     */
    public double getA() {
        return Math.PI * Math.pow(r, 2);
    }
    //endregion

    // Accept

    /**
     * Accepts the visitor. Being this class immutable, returns a new <b>Circle</b>.
     *
     * @param figureVisitor The visitor.
     * @return A new Circle.
     * @see FigureVisitor
     */
    @Override
    public Circle accept(FigureVisitor figureVisitor) {
        return figureVisitor.visit(this);
    }
}
