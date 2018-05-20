package Figures;

import Operations.FigureVisitor;

public class Circle extends Figure implements FigureOperable {

    private final double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    //region Getters
    public double getR() {
        return r;
    }

    public double getA() {
        return Math.PI * Math.pow(r, 2);
    }
    //endregion

    // Accept
    @Override
    public Circle accept(FigureVisitor figureVisitor) {
        return figureVisitor.visit(this);
    }
}