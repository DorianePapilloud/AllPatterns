package Ex1;

public class ConcreteBreakingSystemDecorator extends Decorator{

    public ConcreteBreakingSystemDecorator(ComponentCar componentCar) {
        super(componentCar);
    }


    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public int getSecurityLevel() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
