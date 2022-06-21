package Ex2.Decorators;

import Ex2.Components.Shape;

public class TextureDecorator extends ShapeDecorator {

    String texture;

    public TextureDecorator(Shape decoratedShape, String texture) {
        super(decoratedShape);
        this.texture = texture;
    }

    @Override
    public void draw() {
        setTexture("Wood");
        shape.draw();
    }

    private void setTexture(String texture){
        this.texture = texture;
        System.out.println("Texture: " + texture);
    }
}
