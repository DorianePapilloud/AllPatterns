package Lab16.Lab16e;

import Lab16.Lab16e.Context.ValaisGame;
import Lab16.Lab16e.Invoker.MenuInvoker;
import Lab16.Lab16e.Strategy.StrategyNax;
import Lab16.Lab16e.Strategy.StrategyNendaz;
import Lab16.Lab16e.Strategy.StrategySimplon;

public class Main {
    public static void main(String[] args) {
        ValaisGame myGame = new ValaisGame();
        myGame.setGameStragegy(new StrategyNax());
        MenuInvoker menuInvoker = new MenuInvoker(myGame);
        menuInvoker.callItem(2);
        menuInvoker.callItem(1);
        menuInvoker.callItem(0);
        myGame.setGameStragegy(new StrategyNendaz());
        menuInvoker.callItem(2);
        menuInvoker.callItem(1);
        menuInvoker.callItem(0);
        myGame.setGameStragegy(new StrategySimplon());
        menuInvoker.callItem(2);
        menuInvoker.callItem(1);
        menuInvoker.callItem(0);
    }
}