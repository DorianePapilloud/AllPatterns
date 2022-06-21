package Ex2.Decorators;

import Ex2.Components.Shape;

public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape decoratedShape) {
        this.shape = decoratedShape;
    }

    @Override
    abstract public void draw();
}
