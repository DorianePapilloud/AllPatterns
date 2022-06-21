package Ex2.Decorators;

import Ex2.Components.Shape;

public class ColorDecorator extends ShapeDecorator {

    private String color = "black";

    public ColorDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        setColor("red");
        shape.draw();
    }

    private void setColor(String color){
        this.color = color;
        System.out.println("Color: " + color);
    }
}
