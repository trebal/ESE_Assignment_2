public interface FigureVisitor {
    Circle visit(Circle circle);
    Rectangle visit(Rectangle rectangle);
    Drawing visit(Drawing drawing);
}
