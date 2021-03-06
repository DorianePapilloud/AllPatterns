package Ex1.Templates;

public class SwissRestaurant extends Restaurant {
    public SwissRestaurant(String name) {
        this.name = name;
    }

    @Override
    void prepareDessert() {
        System.out.println("Meringue.");
    }

    @Override
    void prepareCheese() {
        System.out.println("Gruyère.");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Nespresso.");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Papet vaudois");
    }

    @Override
    void prepareVegetables() {
        System.out.println("Salade");
    }

}
