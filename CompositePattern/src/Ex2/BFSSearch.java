package Ex2;


import java.util.ArrayList;

/**
 * Lab 10
 * @author scz
 */
public class BFSSearch extends TraversalAlgoritm {
	
	//Overrided method (q = q+s).
	protected void addSuccessors(ArrayList<Component> q, ArrayList<Component> s)
	{
            q.addAll(s);
	}		
}
