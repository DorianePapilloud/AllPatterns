package Lab16.Lab16d;

import Lab16.Lab16d.Commands.Command;

public class Cabin {

	private Command[] commands = new Command[3];

	
	public void pushKey(int key) {
		commands[key].execute();
	}

	public void setCommand(int key, Command command){
		commands[key] = command;
	}

}
