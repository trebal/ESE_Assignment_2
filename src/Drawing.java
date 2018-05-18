import java.util.ArrayList;

public class Drawing extends Figure {

    private final ArrayList<Figure> components = new ArrayList<>();

    public Drawing(double x, double y, ArrayList<Figure> components, ArrayList<Figure> components1)
    {
        super(x,y);
        this.components.addAll(components);
    }

    // TODO The returned list can not be modified, but should be a Collections.unmodifiableList;
    // Getters
    public ArrayList<Figure> getComponents()
    {
        return components;
    }
}
