package Ex1;

public abstract class Decorator implements ComponentCar{

    ComponentCar componentCar;

    public Decorator(ComponentCar componentCar) {
        this.componentCar = componentCar;
    }


}
