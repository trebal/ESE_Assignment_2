public interface FigureVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Drawing drawing);
}
