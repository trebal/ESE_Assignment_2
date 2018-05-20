package Figures;

import Operations.FigureVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drawing extends Figure implements FigureOperable {

    private final ArrayList<Figure> components;

    public Drawing(double x, double y, ArrayList<Figure> components) {
        super(x, y);
        this.components = components;
    }

    // Getters
    public List<Figure> getComponents() {
        return Collections.unmodifiableList(components);
    }

    // Accept
    @Override
    public Drawing accept(FigureVisitor figureVisitor) {
        return figureVisitor.visit(this);
    }
}
