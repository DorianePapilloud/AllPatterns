package Ex1.Creators;

import Ex1.Cars.CarProduct;

public abstract class CarCreator {

    public CarProduct orderCar(String color) {
        CarProduct productCar = createCar();

        productCar.installEngine();
        productCar.addExtras();
        productCar.paint(color);

        return productCar;
    }

	protected abstract CarProduct createCar();

}
