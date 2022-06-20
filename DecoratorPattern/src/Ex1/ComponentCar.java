package Ex1;

public abstract class ComponentCar {

    protected String description = "";

    public String getDescription() {
        return this.description;
    }

    public abstract int getCost();

    public abstract int getSecurityLevel();
}
