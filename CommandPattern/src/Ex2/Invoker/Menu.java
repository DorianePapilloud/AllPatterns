package Ex2.Invoker;

import Ex2.Commands.Command;
import Ex2.Receiver.TextFile;

public class Menu {

    private Command[] menuItems = new Command[5];

    public void setCommand(int key, Command command) {
        menuItems[key] = command;
    }

    public void callMenuItem(int key, TextFile textFile) {
        menuItems[key].execute(textFile);
    }

}
