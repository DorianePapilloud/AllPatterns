package Ex2;

public class Rectangle implements Shape {

    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("I draw a " + toString());
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
