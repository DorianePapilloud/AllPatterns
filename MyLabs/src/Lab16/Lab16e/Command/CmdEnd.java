package Lab16.Lab16e.Command;

import Lab16.Lab16e.Context.ValaisGame;

public class CmdEnd implements Command {
    private ValaisGame valaisGame;
    
    public CmdEnd(ValaisGame valaisGame) {
        this.valaisGame = valaisGame;
    }

    @Override
    public void execute() {
        valaisGame.end();
    }
}
