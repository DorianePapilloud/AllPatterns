package Lab16.Lab16b.States;

import Lab16.Lab16b.Context.Crane;

public class StateStopped implements IState {

	private Crane crane;
	
	public StateStopped(Crane crane) {
		this.crane = crane;
	}
	
	public void goLeft() {
		crane.setCurrentState(crane.getLeftState());
	}

	public void goRight() {
		crane.setCurrentState(crane.getRightState());
	}

	public void doStop() {	
	}

}
