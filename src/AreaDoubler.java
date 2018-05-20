public class AreaDoubler implements FigureVisitor {

    @Override
    public Circle visit(Circle circle) {

        return circle;
    }

    @Override
    public Rectangle visit(Rectangle rectangle) {

        return rectangle;
    }

    @Override
    public Drawing visit(Drawing drawing) {

        return drawing;
    }
}
