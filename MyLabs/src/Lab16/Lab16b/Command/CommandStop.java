package Lab16.Lab16b.Command;

import Lab16.Lab16b.Context.Crane;

public class CommandStop implements ICommand {

	private Crane crane;
	
	public CommandStop(Crane crane) {
		this.crane = crane;
	}
	
	public void execute() {
		crane.stop();
	}

}
