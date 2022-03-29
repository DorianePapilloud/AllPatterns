package Ex2;

public class BorderDecorator extends ShapeDecorator {

    private int border;

    public BorderDecorator(Shape shape, int border) {
        super(shape);
        this.border = border;
    }

    @Override
    public void draw() {
        System.out.println("Adding " + border + " " + shape.draw());
    }
}
