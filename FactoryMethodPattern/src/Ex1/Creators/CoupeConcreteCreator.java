package Ex1.Creators;

import Ex1.Cars.CarProduct;
import Ex1.Cars.CoupeConcreteProduct;

public class CoupeConcreteCreator extends CarCreator
{
    @Override
    protected CarProduct createCar() {
		return new CoupeConcreteProduct();
	}
}
