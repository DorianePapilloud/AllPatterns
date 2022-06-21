package Ex1.Decorators;

import Ex1.Components.ComponentCar;

public class ConcreteColorDecorator extends Decorator {

    protected static final String description = "beautiful color";
    protected static final int securityLevel = 0;
    protected static final int price = 1340;

    private ComponentCar car = null;

    public ConcreteColorDecorator(ComponentCar car) {
        this.car = car;
    }

    public String getDescription() {
        return this.car.getDescription() + ", " + description;
    }

    public int getCost() {
        return this.car.getCost() + price;
    }

    public int getSecurityLevel() {
        return this.car.getSecurityLevel() + securityLevel;
    }
}
