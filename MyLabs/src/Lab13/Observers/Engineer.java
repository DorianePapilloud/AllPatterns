package Lab13.Observers;

import Lab13.Machine;

public class Engineer implements Observer {
	public String name;

	public Engineer(String name) {
		this.name = name;
	}

	public void update(Machine machine) {
		System.out.println(name + " receives information that machine " + machine + " is stopped.");
	}
}
