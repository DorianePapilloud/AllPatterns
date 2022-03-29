package Ex1;

public class Program {

    public static void main(String[] args) {
        CarCreator coupeCreator = new ConcreteCoupeCreator();
        CarCreator minivanCreator = new ConcreteMinivanCreator();
        CarCreator pickupCreator = new ConcretePickupCreator();
        ProductCar c1 = coupeCreator.orderCar("red");
        System.out.println("Car "
                + c1.getName()
                + " " + c1.getColor()
                + " has been ordered.");
        ProductCar c2 = minivanCreator.orderCar("red");
        System.out.println("Car "
                + c2.getName()
                + " "
                + c2.getColor()
                + " has been ordered.");
        ProductCar  c3 = pickupCreator.orderCar("red");
        System.out.println("Car "
                + c3.getName()
                + " "
                + c3.getColor()
                + " has been ordered.");
    }

}
