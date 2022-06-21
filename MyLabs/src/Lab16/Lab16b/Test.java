package Lab16.Lab16b;

import Lab16.Lab16b.Command.CommandLeft;
import Lab16.Lab16b.Command.CommandRight;
import Lab16.Lab16b.Command.CommandStop;
import Lab16.Lab16b.Command.ICommand;
import Lab16.Lab16b.Context.Crane;
import Lab16.Lab16b.Invoker.RemoteControl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Crane crane = new Crane();
		ICommand stopCmd = new CommandStop(crane);
		ICommand rightCmd = new CommandRight(crane);
		ICommand leftCmd = new CommandLeft(crane);
		RemoteControl remoteControl = new RemoteControl(stopCmd, rightCmd, leftCmd);
		
		remoteControl.pushButton(0);
		remoteControl.pushButton(2);
		remoteControl.pushButton(1);
		remoteControl.pushButton(0);
		remoteControl.pushButton(1);
		remoteControl.pushButton(1);
		remoteControl.pushButton(2);
	}

}
