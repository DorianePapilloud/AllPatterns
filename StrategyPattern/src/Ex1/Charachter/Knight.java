package Ex1.Charachter;

import Ex1.Weapon.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        System.out.println("[character.Knight]");
        this.setWeapon(new SwordBehavior());
    }

    @Override
    public void fight() {
        System.out.print("The knight is ");
        super.fight();
    }
}
