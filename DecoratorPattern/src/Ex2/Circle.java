package Ex2;

public class Circle implements Shape{

    private int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void draw() {
        System.out.println("I draw a " + toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                '}';
    }
}
