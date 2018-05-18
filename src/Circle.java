public class Circle extends Figure {

    private final double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    // Getters
    public double getR() {
        return r;
    }
}
