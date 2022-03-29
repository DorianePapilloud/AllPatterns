package StateExample;

public class StateOff implements State{

    Context context;

    public StateOff(Context context) {
        this.context = context;
    }

    @Override
    public void on() {
        context.setState(context.getOnState());
        System.out.println("Transition to On");
    }

    @Override
    public void off() {
        System.out.println("No state transition");
    }
}
