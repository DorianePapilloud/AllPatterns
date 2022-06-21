package Lab16.Lab16c.Heating;

public class StandardHeating extends HeatingCompany {

	void installGazHeating() {
		System.out.println("install gaz heating");
	}

	@Override
	public void installGroundHeating() {
		installGazHeating();
		System.out.println("Install the ground heating");
	}
	
}
