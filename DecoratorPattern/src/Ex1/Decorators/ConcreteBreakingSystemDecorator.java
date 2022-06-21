package Ex1.Decorators;

import Ex1.Components.ComponentCar;

public class ConcreteBreakingSystemDecorator extends Decorator {

    protected static final String description = "breaking system";
    protected static final int securityLevel = 2;
    protected static final int price = 1200;

    private ComponentCar car = null;

    public ConcreteBreakingSystemDecorator(ComponentCar car) {
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
