import shapes.*;
import visitor.AreaCalculator;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4);
        AreaCalculator calculator = new AreaCalculator();
        circle.accept(calculator);
        rectangle.accept(calculator);
        triangle.accept(calculator);
    }
}
