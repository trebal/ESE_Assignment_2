import java.util.ArrayList;
import java.util.Collections;

public class Drawing extends Figure {

    private final ArrayList<Figure> components = new ArrayList<>();

    public Drawing(double x, double y, ArrayList<Figure> components)
    {
        super(x,y);
        this.components.addAll(components);
        Collections.unmodifiableList(components);
    }

    // TODO The returned list can not be modified, but should be a Collections.unmodifiableList;
    // Getters
    public ArrayList<Figure> getComponents()
    {
        return components;
    }
}
