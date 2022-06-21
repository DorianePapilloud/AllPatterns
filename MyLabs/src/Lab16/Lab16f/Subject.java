package Lab16.Lab16f;

public interface Subject {

	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
	
}
