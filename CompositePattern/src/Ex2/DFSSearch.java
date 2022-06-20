package Ex2;

import java.util.ArrayList;

/**
 * Lab 10
 * @author scz
 */
public class DFSSearch extends TraversalAlgoritm {

    //Overrided method (q = s+q).
    protected void addSuccessors(ArrayList<Component> q, ArrayList<Component> s) {
        q.addAll(0, s);
    }
}
