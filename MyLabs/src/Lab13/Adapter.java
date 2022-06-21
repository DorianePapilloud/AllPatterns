package Lab13;

import Lab13.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Adapter implements Machine {
	
	private OldMachine oldMachine;

	private List<Observer> emptyList;
	
	public Adapter(OldMachine oldMachine) {
		this.oldMachine = oldMachine;
		emptyList = new ArrayList<Observer>();
	}

	public int getNumberOfCapsules() {
		return oldMachine.getNumberOfCapsules();
	}

	public List<Observer> getOwners() {
		return emptyList;
	}

	public boolean isCompletelyUp() {
		return oldMachine.isCompletelyUp();
	}

	public void stop() {
		oldMachine.stop();
	}



}
