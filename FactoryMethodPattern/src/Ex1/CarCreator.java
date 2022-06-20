package Ex1;

/**
 * Lab 4
 * @author scz
 */
public abstract class CarCreator {

    public Car orderCar(String color) {
        Car car = createCar();

        car.installEngine();
        car.addExtras();
        car.paint(color);

        return car;
    }

	protected abstract Car createCar();

}
