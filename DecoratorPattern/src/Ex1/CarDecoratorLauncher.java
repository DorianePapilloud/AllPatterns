package Ex1;

import Ex1.Decoratorr.*;

public class CarDecoratorLauncher {

    public static void main(String[] args) {
        CarDecoratorLauncher launcher = new CarDecoratorLauncher();
        launcher.launch();
    }

    public void launch() {
        ComponentCar car1 = new ConcreteComponentCarBerlin();
        car1 = new ConcreteAirbagDecorator(car1);
        car1 = new ConcreteAirbagDecorator(car1);
        car1 = new ConcreteEngineDecorator(car1);
        car1 = new ConcreteColorDecorator(car1);
        printCarInfos(car1);

        ComponentCar car2 = new ConcreteComponentCarSport();
        car2 = new ConcreteAntiSlidingSystemDecorator(car2);
        car2 = new ConcreteBreakingSystemDecorator(car2);
        printCarInfos(car2);

        ComponentCar car3 = new ConcreteComponentCarBreak();
        car3 = new ConcreteAirbagDecorator(car3);
        car3 = new ConcreteEngineDecorator(car3);
        car3 = new ConcreteColorDecorator(car3);
        car3 = new ConcreteAntiSlidingSystemDecorator(car3);
        car3 = new ConcreteBreakingSystemDecorator(car3);
        printCarInfos(car3);
    }

    public void printCarInfos(ComponentCar car) {
        System.out.println("Car description : " + car.getDescription());
        System.out.println("Car cost : " + car.getCost());
        System.out.println("Car security level : " + car.getSecurityLevel());
        System.out.println();

    }
}
