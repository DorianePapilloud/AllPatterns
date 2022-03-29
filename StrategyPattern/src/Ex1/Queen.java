package Ex1;

public class Queen extends Character{

    public Queen(WeaponBehavior currentWeapon) {
        super(currentWeapon);

    }

    @Override
    public void fight() {
        System.out.print("The queen is ");
        super.fight();
    }

}
