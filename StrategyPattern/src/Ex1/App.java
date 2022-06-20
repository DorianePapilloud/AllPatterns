package Ex1;

import Ex1.Charachter.Character;
import Ex1.Charachter.King;
import Ex1.Charachter.Queen;
import Ex1.Charachter.Troll;
import Ex1.Weapon.AxeBehavior;
import Ex1.Weapon.BowAndArrowBehavior;
import Ex1.Weapon.KnifeBehavior;
import Ex1.Weapon.SwordBehavior;

public class App {

    public static void main(String[] args) {

        Character queen = new Queen();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();
        queen.setWeapon(new SwordBehavior());
        queen.fight();

        Character king = new King();
        king.setWeapon(new SwordBehavior());
        king.fight();
        king.setWeapon(new BowAndArrowBehavior());
        king.fight();

        Character troll = new Troll();
        troll.setWeapon(new AxeBehavior());
        troll.fight();

    }
}
