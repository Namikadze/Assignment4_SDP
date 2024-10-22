package shapes;
import visitor.ShapeVisitor;
public class Rectangle implements Shape {
    private double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
