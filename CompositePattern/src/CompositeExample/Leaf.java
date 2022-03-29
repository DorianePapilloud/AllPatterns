package CompositeExample;

public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("Leaf operation " + name);
    }
}
