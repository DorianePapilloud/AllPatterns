package Ex1;

import Ex1.Cars.CarProduct;
import Ex1.Creators.CarCreator;
import Ex1.Creators.CoupeConcreteCreator;
import Ex1.Creators.MinivanConcreteCreator;
import Ex1.Creators.PickupConcreteCreator;

public class Program {

    public static void main(String[] args) {
        CarCreator coupeCreator = new CoupeConcreteCreator();
        CarCreator minivanCreator = new MinivanConcreteCreator();
        CarCreator pickupCreator = new PickupConcreteCreator();

        CarProduct c1 = coupeCreator.orderCar("red");
        System.out.println("Car "
                + c1.getName()
                + " " + c1.getColor()
                + " has been ordered.");

        CarProduct c2 = minivanCreator.orderCar("red");
        System.out.println("Car "
                + c2.getName()
                + " "
                + c2.getColor()
                + " has been ordered.");

        CarProduct c3 = pickupCreator.orderCar("red");
        System.out.println("Car "
                + c3.getName()
                + " "
                + c3.getColor()
                + " has been ordered.");
    }

}
