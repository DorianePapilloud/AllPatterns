package Ex1.Components;

import Ex1.Components.ComponentCar;

public class ConcreteComponentCarBerlin extends ComponentCar {

    protected static final int securityLevel = 40;
    protected static final int price = 40000;

    public ConcreteComponentCarBerlin() {
        this.description = "Berlin";
    }

    public int getCost() {
        return price;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

}

