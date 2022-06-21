package Ex1.Components.Leaf;

import Ex1.Components.Playable;

public class LeafPlayer implements Playable {

    private final int name;

    public LeafPlayer(int name) {
        this.name = name;
    }

    public void cry() {
        System.out.println(name + " is crying");
    }

    public void enterField() {
        System.out.println(name + " is entering field");
    }

    public void shoot() {
        System.out.println(name + " is shooting");
    }

    public void simulateInjury() {
        System.out.println(name + " is simulating an Injury");
    }
}
