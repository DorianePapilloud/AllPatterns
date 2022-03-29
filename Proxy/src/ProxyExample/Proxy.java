package ProxyExample;

public class Proxy implements Subject{
    private RealSubject realSubject;
    @Override
    public void request() {
        System.out.println("Proxy does some preliminary work and check.");
        this.realSubject = new RealSubject();
        realSubject.request();
    }
}
