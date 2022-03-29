package CompositeExample2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    List<Component> children = new ArrayList<Component>();

    public void add(Component component){
        children.add(component);
    }

    public void getChild(int i){
        children.get(i);
    }

    public void remove(Component component){
        children.remove(component);
    }


    @Override
    public void operation() {
        for (Component component : children){
            component.operation();
        }
    }
}
