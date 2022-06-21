package Lab16.Lab16c.Constructions;

import Lab16.Lab16c.Company.StructureCompany;
import Lab16.Lab16c.Heating.HeatingCompany;

public abstract class Construction {

	protected StructureCompany structureCompany;
	protected HeatingCompany heatingCompany;
	
	public final void constructHouse() {
		createPlans();
		createHouseStructure();
		installHeating();
		paint();
		writeFinalReport();
	}
	
	abstract void createPlans();
	
	void createHouseStructure() {
		structureCompany.constructStructure();
	}
	
	void installHeating() {
		heatingCompany.installGroundHeating();
	}
	public abstract void paint();
	
	abstract void writeFinalReport();
}
