package Lab16.Lab16c.Constructions;

import Lab16.Lab16c.Company.Carpentry;
import Lab16.Lab16c.Heating.EcologicalHeating;

public class Chalet extends Construction {

	public Chalet() {
		this.structureCompany = new Carpentry();
		this.heatingCompany = new EcologicalHeating();
	}
	
	@Override
	public void paint() {
		System.out.println("No painting is needed");
	}

	@Override
	public void createPlans() {
		System.out.println("Create the chalet plans");
	}

	@Override
	public void writeFinalReport() {
		System.out.println("Write final report for Chalet");
	}

}
