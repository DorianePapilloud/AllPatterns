package Lab16.Lab16f;

public class StateOn extends State {

	
	public StateOn(SolarInfrastructure solarInfrastructure) {
		super();
		this.solarInfrastructure = solarInfrastructure;
	}

	@Override
	public void on() {
	}

	@Override
	public void off() {
		solarInfrastructure.setCurrentState(solarInfrastructure.getOffState());
	}

	@Override
	public void compute() {
		solarInfrastructure.setCurrentState(solarInfrastructure.getComputeState());
		State.currentProductionLevel = defineRandomProductionLevel();
		solarInfrastructure.notifyObservers();
	}
}
