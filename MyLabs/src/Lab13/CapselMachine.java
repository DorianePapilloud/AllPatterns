package Lab13;

import Lab13.Observers.Observer;
import Lab13.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class CapselMachine implements Machine, Subject {

	private List<Observer> myOwners;
	private int numberOfCapsules;
	private boolean state;

	public CapselMachine(int numberOfCapsules) {
		this.myOwners = new ArrayList<Observer>();;
		this.numberOfCapsules = numberOfCapsules;
		this.state = true;
	}

	public int getNumberOfCapsules() {
		return numberOfCapsules;
	}

	public List<Observer> getOwners() {
		return myOwners;
	}

	public boolean isCompletelyUp() {
		return state;
	}

	public void stop() {
		notifyObservers();
	}

	public void notifyObservers() {
		for (Observer o : myOwners) 
			o.update(this);
	}

	public void registerObserver(Observer o) {
		myOwners.add(o);
	}

}
