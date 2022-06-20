package Ex1;

public class ConcreteComponentCarSport extends ComponentCar{

    protected static final int SECURITY_LEVEL = 30;
    protected static final int PRICE = 35000;

    public ConcreteComponentCarSport() {
        this.description = "Sport";
    }

    public int getCost() {
        return PRICE;
    }

    public int getSecurityLevel() {
        return SECURITY_LEVEL;
    }

}
