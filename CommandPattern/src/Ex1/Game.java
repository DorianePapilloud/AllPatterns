package Ex1;

public class Game {


    public void pushKey (int key){
        myCommands[key].execute();
        undoCommand = myCommand[Key];
    }

    public void undo() { undoCommand.undo();}

}
