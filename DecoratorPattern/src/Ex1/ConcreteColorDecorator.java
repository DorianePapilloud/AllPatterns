package Ex1;

public class ConcreteColorDecorator extends Decorator{

    public ConcreteColorDecorator(ComponentCar componentCar) {
        super(componentCar);
    }


    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public int getSecurityLevel() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
