package Ex1;

public class Demo {

    public static void main(String[] args) {

        CarBuilder carBuilder = new BerlinCar();
        CarDirector director = new CarDirector();
        director.construct();
        //Car car = ;

    }

}
