package Lab16.Lab16b.States;

import Lab16.Lab16b.Context.Crane;

public class StateGoingRight implements IState {

	private Crane crane;
	
	public StateGoingRight(Crane crane) {
		this.crane = crane;
	}

	public void goLeft() {
		crane.setCurrentState(crane.getLeftState());		
	}

	public void goRight() {
	}

	public void doStop() {
		crane.setCurrentState(crane.getStoppedState());		
	}

}
