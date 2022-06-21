package Lab16.Lab16e.Invoker;


import Lab16.Lab16e.Command.CmdEnd;
import Lab16.Lab16e.Command.CmdMove;
import Lab16.Lab16e.Command.CmdSetWinner;
import Lab16.Lab16e.Command.Command;
import Lab16.Lab16e.Context.ValaisGame;

import java.util.ArrayList;
import java.util.List;

public class MenuInvoker {
    public List<Command> commands = new ArrayList<Command>();

    public MenuInvoker(ValaisGame valaisGame) {
        commands.add(new CmdEnd(valaisGame));
        commands.add(new CmdSetWinner(valaisGame));
        commands.add(new CmdMove(valaisGame));
    }

    public void callItem(int index) {
        commands.get(index).execute();
    }
}

