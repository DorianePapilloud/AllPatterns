package Ex2.Components;

import Ex2.Components.Shape;

public class Square implements Shape {

    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Square with width " + width);
    }

}
