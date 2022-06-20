package Ex1.Charachter;

public class King extends Character {

    public King() {
        System.out.println("[king]");
        // no weapon by default
    }

    @Override
    public void fight() {
        System.out.print("The king is ");
        super.fight();
    }
}
