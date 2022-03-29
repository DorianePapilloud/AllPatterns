package Ex1;

public abstract class AbstractClassPrepareDinner {

    final void prepareDinner(){
        serveWater();
        cleanTable();
        prepareVegetables();
        prepareMainMenu();
        prepareCheese();
        prepareDesert();
        prepareCoffee();
    }

    protected abstract void prepareCoffee();

    protected abstract void prepareDesert();

    protected abstract void prepareCheese();

    protected abstract void prepareMainMenu();

    protected abstract void prepareVegetables();

    public void cleanTable(){
        System.out.println("Same cleaning method");
    };

    public void serveWater(){
        System.out.println("Same cleaning method");
    };

}
