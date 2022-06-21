package Ex1.Commands;

import Ex1.Receiver.Car;

public class BackwardCommand implements Command {

    private Car myCar;

    public BackwardCommand(Car car) {
        this.myCar = car;
    }

    public void execute() {
        myCar.backward();
    }

    public void undo() {
        myCar.forward();
    }

}
