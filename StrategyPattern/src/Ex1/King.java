package Ex1;

public class King extends Character{

    public King(WeaponBehavior currentWeapon) {
        super(currentWeapon);

    }

    @Override
    public void fight() {
        System.out.print("The king is ");
        super.fight();
    }
}
