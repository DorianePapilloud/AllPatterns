package CompositeExample2;

public class Leaf implements Component{
    @Override
    public void operation() {
        System.out.println("Leaf operation +" + this.toString());
    }
}
