package StrategyExample;

public class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("Very nice job...");
        System.out.println("Very nice concrete strategy B");
    }
}
