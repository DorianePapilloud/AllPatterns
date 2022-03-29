package Ex1;

public class Knight extends Character {

    public Knight(WeaponBehavior currentWeapon) {
        super(currentWeapon);
    }

    @Override
    public void fight() {
        System.out.print("The knight is ");
        super.fight();
    }
}
