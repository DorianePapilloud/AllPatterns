package Ex1.Creators;

import Ex1.Cars.CarProduct;
import Ex1.Cars.PickupConcreteProduct;

public class PickupConcreteCreator extends CarCreator
{
    @Override
	protected CarProduct createCar() {
		return new PickupConcreteProduct();
	}
}
