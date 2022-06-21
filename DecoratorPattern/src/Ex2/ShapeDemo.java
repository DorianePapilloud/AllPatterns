package Ex2;

import Ex2.Components.Circle;
import Ex2.Components.Rectangle;
import Ex2.Components.Shape;
import Ex2.Components.Square;
import Ex2.Decorators.BorderDecorator;
import Ex2.Decorators.ColorDecorator;
import Ex2.Decorators.TextureDecorator;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {
    private static List<Shape> shapes;

    public static void main(String[] args) {
        shapes = new ArrayList<Shape>();

        Shape shape1 = new Circle(10);
        Shape shape2 = new Square(5);
        Shape shape3 = new Rectangle(9, 3);

        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);

        for(Shape s : shapes) {
            s.draw();
        }

        shape1 = new BorderDecorator(shape1, 4);
        shape1 = new ColorDecorator(shape1, "Red");
        shape1 = new TextureDecorator(shape1, "points");
        shape1 = new TextureDecorator(shape1, "lines");
        shapes.add(shape1);

        shape2 = new ColorDecorator(shape2, "Green");
        shapes.add(shape2);

        shape3 = new BorderDecorator(shape3, 6);
        shapes.add(shape3);

        for(Shape s : shapes) {
            s.draw();
        }
    }
}
