package Lab16.Lab16e.Command;


import Lab16.Lab16e.Context.ValaisGame;

public class CmdSetWinner implements Command {
    private ValaisGame valaisGame;

    public CmdSetWinner(ValaisGame valaisGame) {
        this.valaisGame = valaisGame;
    }

    @Override
    public void execute() {
        valaisGame.setWinner();
    }
}
