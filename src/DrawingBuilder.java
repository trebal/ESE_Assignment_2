import java.util.ArrayList;

public class DrawingBuilder {

    protected double x;
    protected double y;
    protected ArrayList<Figure> components = new ArrayList<>();

    public Drawing build() throws BuilderException
    {
        return null;
    }

    public void addFigure(Figure figure)
    {
        components.add(figure);
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }
}
