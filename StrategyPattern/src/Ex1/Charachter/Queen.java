package Ex1.Charachter;

public class Queen extends Character {

    public Queen() {
        System.out.println("[character.Queen]");
        // no weapon by default
    }


    @Override
    public void fight() {
        System.out.print("The queen is ");
        super.fight();
    }

}
