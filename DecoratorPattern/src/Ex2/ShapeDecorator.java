package Ex2;

public abstract class ShapeDecorator implements Shape{

    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
}
