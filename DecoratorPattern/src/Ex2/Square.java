package Ex2;

public class Square implements Shape{

    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("I draw a " + toString());
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }
}
