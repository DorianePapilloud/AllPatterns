package Ex1.Charachter;

import Ex1.Weapon.WeaponBehavior;

public abstract class Character {

    private WeaponBehavior weapon = null;

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        if (this.weapon == null) {
            System.out.println("no weapon for this caracter");
        } else {
            this.weapon.useWeapon();
        }
    }

}
