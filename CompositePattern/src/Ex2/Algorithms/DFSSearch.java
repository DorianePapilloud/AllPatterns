package Ex2.Algorithms;

import Ex2.Components.Component;

import java.util.ArrayList;


public class DFSSearch extends TraversalAlgoritm {

    //Overrided method (q = s+q).
    protected void addSuccessors(ArrayList<Component> q, ArrayList<Component> s) {
        q.addAll(0, s);
    }
}
