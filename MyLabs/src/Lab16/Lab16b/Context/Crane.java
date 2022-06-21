package Lab16.Lab16b.Context;

import Lab16.Lab16b.States.IState;
import Lab16.Lab16b.States.StateGoingLeft;
import Lab16.Lab16b.States.StateGoingRight;
import Lab16.Lab16b.States.StateStopped;

public class Crane {

    private IState leftState;
    private IState rightState;
    private IState stoppedState;
    private IState currentState;

    public Crane(){
    	leftState = new StateGoingLeft(this);
    	rightState = new StateGoingRight(this);
    	stoppedState = new StateStopped(this);
    	currentState = stoppedState;
    }

    public void setCurrentState(IState state) {
    	this.currentState = state;
    }

	public IState getLeftState() {
		return leftState;
	}

	public IState getRightState() {
		return rightState;
	}

	public IState getStoppedState() {
		return stoppedState;
	}

	public IState getCurrentState() {
		return currentState;
	}    
	
	public void right(){
		System.out.println("Crane goes Right");
		currentState.goRight();
	}
	public void left(){
		System.out.println("Crane goes Left");
		currentState.goLeft();
	}
	public void stop(){
		System.out.println("Crane Stops");
		currentState.doStop();
	}
}
