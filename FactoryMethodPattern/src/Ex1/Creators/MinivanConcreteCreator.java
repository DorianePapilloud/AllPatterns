package Ex1.Creators;

import Ex1.Cars.CarProduct;
import Ex1.Cars.MinivanConcreteProduct;

public class MinivanConcreteCreator extends CarCreator
{
    @Override
	protected CarProduct createCar() {
		return new MinivanConcreteProduct() ;
	}
}
