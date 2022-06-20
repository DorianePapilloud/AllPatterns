package Ex1;

/**
 * Lab 4
 * @author scz
 */
public class MinivanCreator extends CarCreator
{
    @Override
	protected Car createCar() {
		return new Minivan() ;
	}
}
