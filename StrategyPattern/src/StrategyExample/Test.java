package StrategyExample;

public class Test {
    public static void main(String[] args) {

        Context context = new Context(new ConcreteStrategyB());
        context.doSomeJob();
        context.setCurrentStrategy(new ConcreteStrategyA());
        context.doSomeJob();

    }
}
