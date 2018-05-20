public abstract class Figure implements FigureOperable {

    private final double x;
    private final double y;

    Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
