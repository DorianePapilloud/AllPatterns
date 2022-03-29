package Ex1;

public class Troll extends Character {

    public Troll(WeaponBehavior currentWeapon) {
        super(currentWeapon);
    }

    @Override
    public void fight() {
        System.out.print("The troll is ");
        super.fight();
    }
}
