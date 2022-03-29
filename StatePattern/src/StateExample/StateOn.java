package StateExample;

public class StateOn implements State {

    Context context;

    public StateOn(Context context) {
        this.context = context;
    }

    @Override
    public void on() {
        System.out.println("No state transition");
    }

    @Override
    public void off() {
        context.setState(context.getOffState());
        System.out.println("Transition to OFF");
    }
}
