package Lab16.Lab16b.Invoker;

import Lab16.Lab16b.Command.ICommand;

public class RemoteControl {

	ICommand[] commands = new ICommand[3];

	public RemoteControl(ICommand stopCmd, ICommand rightCmd, ICommand leftCmd){
		commands[0] = stopCmd;
		commands[1] = rightCmd;
		commands[2] = leftCmd;
	}
	
	public void pushButton(int key) {
		commands[key].execute();
	}
}
