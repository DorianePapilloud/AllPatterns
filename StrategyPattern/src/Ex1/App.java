package Ex1;

public class App {

    public static void main(String[] args) {

        Character queen = new Queen(new KnifeBehavior());
        queen.fight();
        queen.setCurrentWeapon(new SwordBehavior());
        queen.fight();

        Character king = new King(new KnifeBehavior());
        king.fight();
        king.setCurrentWeapon(new BowAndArrowBehavior());
        king.fight();

        Character troll = new Troll(new AxeBehavior());
        troll.fight();

    }
}
