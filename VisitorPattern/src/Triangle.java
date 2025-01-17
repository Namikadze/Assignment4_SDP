package shapes;
import visitor.ShapeVisitor;
public class Triangle implements Shape {
    private double base, height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
