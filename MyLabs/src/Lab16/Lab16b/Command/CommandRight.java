package Lab16.Lab16b.Command;

import Lab16.Lab16b.Context.Crane;

public class CommandRight implements ICommand {

	private Crane crane;
	
	public CommandRight(Crane crane) {
		this.crane = crane;
	}
	
	public void execute() {
		crane.right();
	}

}
