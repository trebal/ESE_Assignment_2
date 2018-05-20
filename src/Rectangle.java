public class Rectangle extends Figure implements FigureOperable {

    private final double width;
    private final double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Accept
    @Override
    public Rectangle accept(FigureVisitor figureVisitor) {
        return figureVisitor.visit(this);
    }
}
