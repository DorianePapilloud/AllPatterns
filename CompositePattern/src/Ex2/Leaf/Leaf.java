package Ex2.Leaf;

import Ex2.Components.Component;

import java.util.ArrayList;

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
