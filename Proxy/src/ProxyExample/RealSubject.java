package ProxyExample;

public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("Real subject action.");
    }
}
