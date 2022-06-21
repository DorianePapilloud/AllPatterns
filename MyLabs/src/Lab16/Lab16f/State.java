package Lab16.Lab16f;

import java.util.Random;

public abstract class State {

	static protected ProductionLevel currentProductionLevel = ProductionLevel.low;
	protected SolarInfrastructure solarInfrastructure;

    private Random rnd = new Random();

	public abstract void on();
	public abstract void off();
	public abstract void compute();
	
    protected ProductionLevel defineRandomProductionLevel() {
    	return ProductionLevel.values()[rnd.nextInt(3)];
    }
	
}
