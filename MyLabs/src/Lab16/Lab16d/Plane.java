package Lab16.Lab16d;

public class Plane {
	
	String name;
	
	Plane(String name) {
		this.name = name;
	}
	
	public void takeoff() {
		System.out.println("Plane " + name + " is taking off.");
	}
	
	public void landing() {
		System.out.println("Plane " + name + " is landing.");
	}
	
	public void startautopilot() {
		System.out.println("Plane " + name + " starts autopilot.");
	}

}
