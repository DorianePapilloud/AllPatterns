package Ex2.Composites;

import Ex2.Components.Component;

import java.util.ArrayList;


public class Composite extends Component {

    private String name;
    private final ArrayList<Component> children;

    public Composite(String n) {
        name = n;
        children = new ArrayList<Component>();
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public ArrayList<Component> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        String temp = "Composite " + name;
        for (Component n : this.children) {
            temp = temp + n.toString();
        }
        return temp;
    }
}
