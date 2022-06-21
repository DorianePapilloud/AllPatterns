package StateExample;

public class Context {

    private State onState;
    private State offState;
    private State currentState;

    public Context() {
        this.onState = new StateOn(this);
        this.offState = new StateOff(this);
        this.currentState = offState;
    }

        public void setState(State state){
            currentState = state;
        }


    public State getOnState() {
        return onState;
    }

    public State getOffState() {
        return offState;
    }

    public void on(){
        currentState.on();
    }

    public void off(){
        currentState.off();
    }


}
