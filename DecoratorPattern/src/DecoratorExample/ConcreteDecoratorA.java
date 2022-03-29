package DecoratorExample;

public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("I am adding new responsabilites at runtime");
        super.operation();
    }
}
