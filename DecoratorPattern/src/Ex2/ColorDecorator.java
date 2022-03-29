package Ex2;

public class ColorDecorator extends ShapeDecorator{

    private String color;

    public ColorDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Adding " + color + " " + shape.toString());
    }
}
