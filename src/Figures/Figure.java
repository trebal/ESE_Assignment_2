package Figures;

import Operations.FigureVisitor;

/**
 * The abstract class <b>Figure</b>, which the classes <b>Circle</b>, <b>Rectangle</b> and <b>Drawing</b> extend.
 * Any <b>Figure</b> has a value <b>x</b> and <b>y</b> which represents the coordinates.
 * The methods <b>getX</b> and <b>getY</b> return the corresponding coordinate.
 * This class is immutable and the parameters can only be obtained with getters.
 *
 * @author Ramon de Llano Chamorro
 * @version 1.1
 */
public abstract class Figure {

    /**
     * Coordinate <b>x</b> of the Figure.
     */
    private final double x;
    /**
     * Coordinate <b>y</b> of the Figure.
     */
    private final double y;

    /**
     * The constructor of the class.
     *
     * @param x Coordinate <b>x</b>.
     * @param y Coordinate <b>y</b>.
     */
    Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * The accept method allows FigureVisitors to get information.
     *
     * @param figureVisitor A visitor.
     */
    public abstract void accept(FigureVisitor figureVisitor);

    //region Getters

    /**
     * Returns the <b>x</b> coordinate.
     *
     * @return The <b>x</b> coordinate.
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the <b>y</b> coordinate.
     *
     * @return The <b>y</b> coordinate.
     */
    public double getY() {
        return y;
    }
    //endregion
}
