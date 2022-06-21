package Ex2.Factories;

import Ex2.Cars.Car;
import Ex2.Cars.Coupe;

// Coupe factory = Concrete Factory 1

public class CoupeFactory implements CarFactory {

    public Car createCar() {
        return new Coupe();
    }

}
