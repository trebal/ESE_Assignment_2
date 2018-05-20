package Builders;

import Figures.Figure;
import Figures.Drawing;

import java.util.ArrayList;

public class DrawingBuilder {

    public double x;
    public double y;
    public ArrayList<Figure> components = new ArrayList<>();

    public Drawing build() throws BuilderException {
        if (components.isEmpty()) {
            throw new BuilderException("The list of Figures is empty.");
        } else {
            return new Drawing(x, y, components);
        }
    }

    public void addFigure(Figure figure) {
        components.add(figure);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
