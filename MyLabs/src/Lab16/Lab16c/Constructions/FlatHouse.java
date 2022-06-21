package Lab16.Lab16c.Constructions;

import Lab16.Lab16c.Company.ConcreteCompany;
import Lab16.Lab16c.Heating.StandardHeating;

public class FlatHouse extends Construction {
	
	public FlatHouse(){
		this.structureCompany = new ConcreteCompany();
		this.heatingCompany = new StandardHeating();
	}

	@Override
	public void paint() {
		System.out.println("Painting the flat house");
	}

	@Override
	void createPlans() {
		System.out.println("Creat 3 flats house plans");
	}

	@Override
	void writeFinalReport() {
		System.out.println("Write final report for flat house");
	}

}
