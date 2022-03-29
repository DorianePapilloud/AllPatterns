package CompositeExample;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void operation();

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public void getChild(int i) {
        throw new UnsupportedOperationException();
    }
}
