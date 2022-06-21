package Lab16.Lab16e.Command;


import Lab16.Lab16e.Context.ValaisGame;

public class CmdMove implements Command {
    private ValaisGame valaisGame;

    public CmdMove(ValaisGame valaisGame) {
        this.valaisGame = valaisGame;
    }

    @Override
    public void execute() {
        valaisGame.move();
    }
}
