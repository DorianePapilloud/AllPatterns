package DecoratorExample;

public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        addedBehaviour();
        super.operation();
    }


    private void addedBehaviour(){
        System.out.println("Adding some behaviour");
    }

}
