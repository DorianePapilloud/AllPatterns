package Ex1;


public class CoupeCreator extends CarCreator
{
    @Override
    protected Car createCar() {
		return new Coupe();
	}
}
