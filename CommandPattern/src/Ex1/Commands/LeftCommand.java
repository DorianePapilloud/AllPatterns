package Ex1.Commands;

import Ex1.Receiver.Car;

public class LeftCommand implements Command {

    private Car myCar;

    public LeftCommand(Car car) {
        this.myCar = car;
    }

    public void execute() {
        myCar.left();
    }

    public void undo() {
        myCar.right();
    }

}
