package Lab13;

import Lab13.Observers.Observer;

import java.util.List;

public interface Machine {
	int getNumberOfCapsules();
	boolean isCompletelyUp();
	void stop();
	List<Observer> getOwners();
}
