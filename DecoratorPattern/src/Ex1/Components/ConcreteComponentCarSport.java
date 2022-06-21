package Ex1.Components;

public class ConcreteComponentCarSport extends ComponentCar {

    protected static final int securityLevel = 30;
    protected static final int price = 35000;

    public ConcreteComponentCarSport() {
        this.description = "Sport";
    }

    public int getCost() {
        return price;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

}
