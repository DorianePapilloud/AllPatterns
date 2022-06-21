package Ex1.Invoker;

import Ex1.Commands.Command;

public class Game {

    public void pushKey(int key) {
        myCommands[key].execute();
        undoCommand = myCommands[key];
    }

    public void undo(){
        undoCommand.undo();
    }

    public void setCommand(int key, Command command){
        myCommands[key] = command;
    }

    private Command undoCommand;
    private Command[] myCommands = new Command[4];;

}
