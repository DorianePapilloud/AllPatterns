package Ex1;

/**
 * Lab 4
 * @author scz
 */
public class PickupCreator extends CarCreator
{
    @Override
	protected Car createCar() {
		return new Pickup();
	}
}
