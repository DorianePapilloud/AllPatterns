package Ex1.Commands;

import Ex1.Receiver.Car;

public class RightCommand implements Command {

    private Car myCar;

    public RightCommand(Car car) {
        this.myCar = car;
    }

    public void execute() {
        myCar.right();
    }

    public void undo() {
        myCar.left();
    }

}
