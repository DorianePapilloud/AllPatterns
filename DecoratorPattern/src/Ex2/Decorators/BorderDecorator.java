package Ex2.Decorators;

import Ex2.Components.Shape;

public class BorderDecorator extends ShapeDecorator {

    int borderThickness = 1;

    public BorderDecorator(Shape decoratedShape, int borderThickness) {
        super(decoratedShape);
        this.borderThickness = borderThickness;
    }

    @Override
    public void draw() {
        setBorderThickness(10);
        shape.draw();
    }

    private void setBorderThickness(int borderThickness){
        this.borderThickness = borderThickness;
        System.out.println("Border with thickness: " + borderThickness);
    }

}
