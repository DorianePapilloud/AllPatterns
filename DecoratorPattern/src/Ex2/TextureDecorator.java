package Ex2;

public class TextureDecorator extends ShapeDecorator {

    public String points;

    public TextureDecorator(Shape shape, String points) {
        super(shape);
        this.points = points;

    }

    @Override
    public void draw() {
        System.out.println("Adding " + points + " " + shape.toString());
    }
}
