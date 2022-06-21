package Ex1.Decorators;

import Ex1.Components.ComponentCar;

public class ConcreteAirbagDecorator extends Decorator {


    protected static final String description = "airbag(s)";
    protected static final int securityLevel = 4;
    protected static final int price = 1790;

    private ComponentCar car = null;

    public ConcreteAirbagDecorator(ComponentCar car) {
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
