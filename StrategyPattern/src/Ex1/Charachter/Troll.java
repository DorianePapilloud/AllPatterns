package Ex1.Charachter;

import Ex1.Weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        System.out.println("[character.Troll]");
        this.setWeapon(new AxeBehavior());
    }

    @Override
    public void fight() {
        System.out.print("The troll is ");
        super.fight();
    }
}
