package Lab16.Lab16d.Commands;

import Lab16.Lab16d.Commands.Command;
import Lab16.Lab16d.Plane;

public class TakeoffCommand implements Command {

	public TakeoffCommand(Plane plane) {
		super();
		this.plane = plane;
	}

	@Override
	public void execute() {
		plane.takeoff();
	}

	private Plane plane;

}
