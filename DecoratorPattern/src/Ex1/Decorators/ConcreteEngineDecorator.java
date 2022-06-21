package Ex1.Decorators;

import Ex1.Components.ComponentCar;

public class ConcreteEngineDecorator extends Decorator {

    protected static final String description = "engine";
    protected static final int securityLevel = 1;
    protected static final int price = 4500;

    private ComponentCar car = null;

    public ConcreteEngineDecorator(ComponentCar car) {
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
