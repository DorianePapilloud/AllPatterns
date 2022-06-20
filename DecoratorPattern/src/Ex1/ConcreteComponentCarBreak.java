package Ex1;

public class ConcreteComponentCarBreak extends ComponentCar{

    protected static final int SECURITY_LEVEL = 50;
    protected static final int PRICE = 30000;

    public ConcreteComponentCarBreak() {
        this.description = "Break";
    }

    public int getCost() {
        return PRICE;
    }

    public int getSecurityLevel() {
        return SECURITY_LEVEL;
    }

}

