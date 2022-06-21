package Ex1.Components;

import Ex1.Components.ComponentCar;

public class ConcreteComponentCarBreak extends ComponentCar {

    protected static final int securityLevel = 50;
    protected static final int price = 30000;

    public ConcreteComponentCarBreak() {
        this.description = "Break";
    }

    public int getCost() {
        return price;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

}

