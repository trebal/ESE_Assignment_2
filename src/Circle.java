public class Circle extends Figure implements FigureOperable {

    private final double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    // Getters
    public double getR() {
        return r;
    }

    // Accept
    @Override
    public Circle accept(FigureVisitor figureVisitor) {
        return figureVisitor.visit(this);
    }
}
