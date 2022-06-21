package Ex2.Factories;

import Ex2.Cars.Car;
import Ex2.Cars.Pickup;

// Pickup factory = Concrete factory 3

public class PickupFactory implements CarFactory {

    public Car createCar() {
        return new Pickup();
    }

}
