package Ex1.Templates;

public abstract class Restaurant {
    protected String name;

    final public void prepareDinner() {
        System.out.println("--- " + name + " starts preparing dinner.");
        serveWater();
        prepareVegetables();
        prepareMainMenu();
        prepareCheese();
        prepareDessert();
        prepareCoffee();
        cleanTable();
    }

    private void serveWater(){
        System.out.println("I am serving water.");
    }
    private void cleanTable() {
        System.out.println("and cleaning the talbe");
    }

    abstract void prepareVegetables();
    abstract void prepareMainMenu();
    abstract void prepareCheese();
    abstract void prepareDessert();
    abstract void prepareCoffee();

}
