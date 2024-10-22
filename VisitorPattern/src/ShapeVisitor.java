package visitor;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Triangle;
public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
}
