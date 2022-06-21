package Ex1.Decorators;

import Ex1.Components.ComponentCar;

public class ConcreteAntiSlidingSystemDecorator extends Decorator {

    protected static final String description = "anti-sliding system";
    protected static final int securityLevel = 4;
    protected static final int price = 2300;

    private ComponentCar car = null;

    public ConcreteAntiSlidingSystemDecorator(ComponentCar car) {
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
