package Ex1;

public class Character {

    private WeaponBehavior currentWeapon;

    public Character(WeaponBehavior currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public void setCurrentWeapon(WeaponBehavior currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public void fight(){
        currentWeapon.useWeapon();
    }

}
