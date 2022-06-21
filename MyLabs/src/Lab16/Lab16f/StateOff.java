package Lab16.Lab16f;

public class StateOff extends State {

	public StateOff(SolarInfrastructure solarInfrastructure) {
		super();
		this.solarInfrastructure = solarInfrastructure;
	}

	@Override
	public void on() {
		solarInfrastructure.setCurrentState(solarInfrastructure.getOnState());
	}

	@Override
	public void off() {
	}

	@Override
	public void compute() {
	}
}
