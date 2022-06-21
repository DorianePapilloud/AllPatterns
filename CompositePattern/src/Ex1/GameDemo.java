package Ex1;

import Ex1.Components.Leaf.LeafPlayer;
import Ex1.Composites.CompositeTeam;

public class GameDemo {

    public static void main(String[] args) {

        LeafPlayer jo = new LeafPlayer(1);
        LeafPlayer jean = new LeafPlayer(2);
        LeafPlayer paul = new LeafPlayer(3);

        jo.cry();
        jean.cry();
        jo.enterField();

        CompositeTeam team1 = new CompositeTeam();
        team1.add(jo);
        team1.add(jean);
        team1.add(paul);

        team1.enterField();
        team1.cry();
        team1.simulateInjury();

        LeafPlayer martine = new LeafPlayer(3);
        LeafPlayer isabelle = new LeafPlayer(4);
        LeafPlayer mariePaule = new LeafPlayer(5);

        CompositeTeam team2 = new CompositeTeam();
        team2.add(martine);
        team2.add(isabelle);
        team2.add(mariePaule);

        team2.add(team1);

        team2.enterField();
        team2.cry();
        team2.simulateInjury();

        System.out.println("removing");

        team2.remove(team1);

        team2.simulateInjury();
    }
}
