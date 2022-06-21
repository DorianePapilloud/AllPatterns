package Lab16.Lab16b.Command;

import Lab16.Lab16b.Context.Crane;

public class CommandLeft implements ICommand {

	private Crane crane;
	
	public CommandLeft(Crane crane) {
		this.crane = crane;
	}
	
	public void execute() {
		crane.left();
	}

}
