package Lab13;

import Lab13.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class MachineGroup implements Machine {

	private List<Machine> myMachines;
	
	public MachineGroup() {
		this.myMachines = new ArrayList<Machine>();
	}

	public int getNumberOfCapsules() {
		int nr = 0;
		for (Machine m : myMachines)
			nr = nr + m.getNumberOfCapsules();
		return nr;
	}

	public List<Observer> getOwners() {
		List<Observer> tempOwners = new ArrayList<Observer>(); 
		for (Machine m : myMachines)
			tempOwners.addAll(m.getOwners());
		return tempOwners;
	}

	public boolean isCompletelyUp() {
		boolean status = true;
		for (Machine m : myMachines)
			status = status & m.isCompletelyUp();
		return status;
	}

	public void stop() {
		for (Machine m : myMachines)
			m.stop();
	}
	
	public void add(Machine m) {
		myMachines.add(m);
	}
}
