package Ex1;

import java.util.ArrayList;
import java.util.List;

public class CompositeTeam implements Playable{

    List<Playable> team = new ArrayList<Playable>();

    public void add(LeafPlayer leafPlayer) {
        team.add(leafPlayer);
    }

    @Override
    public void cry() {
        for(Playable p : team){
            p.cry();
        }
    }

    public void enterField() {
    }

    @Override
    public void simulateInjury() {

    }

    public void remove(CompositeTeam compositeTeam) {
    }

    public void add(CompositeTeam team1) {
    }
}
