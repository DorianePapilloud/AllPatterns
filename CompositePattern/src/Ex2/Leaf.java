package Ex2;

import java.util.ArrayList;

/**
 * Lab 10
 * @author scz
 */
public class Leaf extends Component {

    private final String name;

    public Leaf(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Leaf " + name;
    }

    @Override
    public ArrayList<Component> getChildren() {
        return new ArrayList<Component>();
    }
}
