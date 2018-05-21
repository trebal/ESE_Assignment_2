package Figures;

import Operations.FigureVisitor;

/**
 * The class <b>Rectangle</b>, which extends the abstract class <b>Figure</b>.
 * It has the methods <b>getWidth</b> and <b>getHeight</b> for obtaining the <b>height</b> and <b>width</b> respectively
 * and <b>getA</b> for calculate the area.
 * This class is immutable and the parameters can only be obtained with getters.
 * This class implements the FigureOperable interface in order to use the Visitor pattern.
 *
 * @author Ramon de Llano Chamorro
 * @version 1.0
 * @see FigureOperable
 * @see FigureVisitor
 */
public class Rectangle extends Figure implements FigureOperable {
    /**
     * The <b>width</b> of the Rectangle.
     */
    private final double width;
    /**
     * The <b>height</b> of the Rectangle.
     */
    private final double height;

    /**
     * The constructor of the class.
     * @param x Coordinate <p>x</p> of the superclass.
     * @param y Coordinate <b>y</b> of the superclass.
     * @param width The <b>width</b> of the Rectangle.
     * @param height The <b>height</b> of the Rectangle.
     */
    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    //region Getters

    /**
     * Returns the <b>width</b> of the Rectangle.
     * @return The <b>width</b>.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the <b>height</b> of the Rectangle.
     * @return The <b>height</b>.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Calculates and returns the <b>area</b> of the Rectangle.
     * @return The <b>area</b>.
     */
    public double getA() {
        return width * getHeight();
    }
    //endregion

    // Accept

    /**
     * Accepts the visitor. Being this class immutable, returns a new <b>Rectangle</b>.
     * @param figureVisitor The visitor.
     * @return A new Rectangle.
     * @see FigureVisitor
     */
    @Override
    public Rectangle accept(FigureVisitor figureVisitor) {
        return figureVisitor.visit(this);
    }
}
