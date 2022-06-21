package Ex1.Commands;

import Ex1.Receiver.Car;

public class ForwardCommand implements Command {

    private Car myCar;

    public ForwardCommand(Car car) {
        this.myCar = car;
    }

    public void execute() {
        myCar.forward();
    }

    public void undo() {
        myCar.backward();
    }

}
