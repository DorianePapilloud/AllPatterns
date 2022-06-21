package Ex2.Components;

public class Rectangle implements Shape {

    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle with length " + length + " and width " + width);
    }

}
