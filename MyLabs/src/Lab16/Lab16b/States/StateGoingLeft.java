package Lab16.Lab16b.States;

import Lab16.Lab16b.Context.Crane;

public class StateGoingLeft implements IState {

	private Crane crane;
	
	public StateGoingLeft(Crane crane) {
		this.crane = crane;
	}

	public void goLeft() {	
	}

	public void goRight() {
		crane.setCurrentState(crane.getRightState());		
	}

	public void doStop() {
		crane.setCurrentState(crane.getStoppedState());		
	}

}
