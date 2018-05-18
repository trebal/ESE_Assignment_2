import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drawing extends Figure {

    private final List<Figure> components;// = new ArrayList<>();

    public Drawing(double x, double y, ArrayList<Figure> components)
    {
        super(x,y);
        this.components = components;
        /*ArrayList<Figure> tmp = new ArrayList<>();
        tmp.addAll(components);
        this.components = Collections.unmodifiableList(tmp);*/
    }

    // Getters
    public List<Figure> getComponents()
    {
        //return components;
        return Collections.unmodifiableList(components);
    }
}
