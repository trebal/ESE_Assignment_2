import java.util.ArrayList;

public class AreaDoubler implements FigureVisitor {

    @Override
    public Circle visit(Circle circle) {
        double r = circle.getR() * Math.sqrt(2.0);

        return new Circle(circle.getX(), circle.getY(), r);
    }

    @Override
    public Rectangle visit(Rectangle rectangle) {
        double width = rectangle.getWidth() * Math.sqrt(2.0);
        double height = rectangle.getHeight() * Math.sqrt(2.0);

        return new Rectangle(rectangle.getX(), rectangle.getY(), width, height);
    }

    @Override
    public Drawing visit(Drawing drawing) {
        ArrayList<Figure> components = new ArrayList<>();
        for (Figure figure : drawing.getComponents()) {
            components.add(figure.accept(this));
        }

        return new Drawing(drawing.getX(), drawing.getY(), components);
    }
}
