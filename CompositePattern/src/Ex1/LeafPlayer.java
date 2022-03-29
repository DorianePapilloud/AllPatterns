package Ex1;

public class LeafPlayer implements Playable {

    int player;

    public LeafPlayer(int player) {
        this.player = player;
    }

    @Override
    public void cry() {
        System.out.println(player + "is crying");
    }

    @Override
    public void enterField() {
        System.out.println(player + "has entered the field");
    }

    @Override
    public void simulateInjury() {
        System.out.println(player + "is simulating that bastard");
    }

}
