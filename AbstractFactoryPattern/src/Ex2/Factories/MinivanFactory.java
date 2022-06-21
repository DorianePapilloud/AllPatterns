package Ex2.Factories;

import Ex2.Cars.Car;
import Ex2.Cars.Minivan;

// Minivan factory = Concrete Factory 2

public class MinivanFactory implements CarFactory {

    public Car createCar() {
        return new Minivan();
    }

}
