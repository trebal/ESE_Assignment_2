package Builders;

import Figures.Figure;
import Figures.Drawing;

import java.util.ArrayList;

/**
 * The class <b>DrawingBuilder</b> is a builder class for <b>Drawing</b> which allows to add figures to a list and then
 * build the final, immutable <b>Drawing</b>.
 * It has a method <b>addFigure</b> and <b>removeFigure</b> to add and remove Figures to the list of components.
 * The method <b>build</b> creates the final Drawing.
 *
 * @author Ramon de Llano Chamorro
 * @version 1.0
 * @see Drawing
 */
public class DrawingBuilder {
    /**
     * Coordinate <b>x</b> of the Drawing.
     */
    public double x;
    /**
     * Coordinate <b>y</b> of the Drawing
     */
    public double y;
    /**
     * A list of <b>Figure</b> components.
     */
    public ArrayList<Figure> components = new ArrayList<>();

    /**
     * The builder method which creates the immutable <b>Drawing</b> and allows to create the object step by step.
     * @return A new immutable <b>Drawing</b> using the set parameters.
     * @throws BuilderException Throws this exception if the list is empty thus being a useless object.
     */
    public Drawing build() throws BuilderException {
        if (components.isEmpty()) {
            throw new BuilderException("The list of Figures is empty.");
        } else {
            return new Drawing(x, y, components);
        }
    }

    /**
     * Adds a new Figure to the list.
     * @param figure The Figure to add.
     */
    public void addFigure(Figure figure) {
        components.add(figure);
    }

    /**
     * Removes the Figure from the list.
     * @param figure The Figure to remove.
     */
    public void removeFigure(Figure figure) {
        components.remove(figure);
    }

    //region Setters

    /**
     * Sets the <b>x</b> of the Drawing.
     * @param x The <b>x</b> coordinate.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Sets the <b>y</b> of the Drawing.
     * @param y The <b>y</b> coordinate.
     */
    public void setY(double y) {
        this.y = y;
    }
    //endregion
}
