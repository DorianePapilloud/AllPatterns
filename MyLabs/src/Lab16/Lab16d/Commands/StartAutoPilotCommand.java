package Lab16.Lab16d.Commands;

import Lab16.Lab16d.Commands.Command;
import Lab16.Lab16d.Plane;

public class StartAutoPilotCommand implements Command {

	public StartAutoPilotCommand(Plane plane) {
		super();
		this.plane = plane;
	}

	@Override
	public void execute() {
		plane.startautopilot();
	}

	private Plane plane;

}
