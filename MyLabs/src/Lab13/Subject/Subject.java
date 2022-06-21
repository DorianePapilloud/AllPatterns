package Lab13.Subject;

import Lab13.Observers.Observer;

public interface Subject {

	void registerObserver(Observer o);
	void notifyObservers();
}
