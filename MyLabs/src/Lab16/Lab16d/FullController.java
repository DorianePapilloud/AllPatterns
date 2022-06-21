package Lab16.Lab16d;

import Lab16.Lab16d.Cabin;
import Lab16.Lab16d.Commands.LandingCommand;
import Lab16.Lab16d.Commands.StartAutoPilotCommand;
import Lab16.Lab16d.Commands.TakeoffCommand;
import Lab16.Lab16d.Controller;
import Lab16.Lab16d.Pilot;
import Lab16.Lab16d.Plane;

public class FullController implements Controller {

	public FullController(Plane plane) {
		this.cabin = new Cabin();
		cabin.setCommand(0, new TakeoffCommand(plane));
		cabin.setCommand(1, new LandingCommand(plane));
		cabin.setCommand(2, new StartAutoPilotCommand(plane));
	}

	@Override
	public void takeOff(Pilot pilot) {
		cabin.pushKey(0);
	}

	@Override
	public void landing(Pilot pilot) {
		cabin.pushKey(1);
	}

	@Override
	public void startAutoPilot(Pilot pilot) {
		cabin.pushKey(2);
	}

	private Cabin cabin;

}
