package StrategyExample;

public class Context {

    private Strategy currentStrategy;

    public Context(Strategy currentStrategy) {
        this.currentStrategy = currentStrategy;
    }

    public void setCurrentStrategy(Strategy currentStrategy) {
        this.currentStrategy = currentStrategy;
    }

    public void doSomeJob(){
        currentStrategy.algorithm();
    }
}
