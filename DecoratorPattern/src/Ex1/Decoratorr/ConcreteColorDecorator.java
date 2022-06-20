package Ex1.Decoratorr;

import Ex1.ComponentCar;
import Ex1.Decorator;

public class ConcreteColorDecorator extends Decorator {

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
