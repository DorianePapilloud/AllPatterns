package CompositeExample;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

    List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void operation() {
        for(Component component : children){
            component.operation();
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void getChild(int i) {
        children.get(i);
    }
}
