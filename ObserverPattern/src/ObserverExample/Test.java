package ObserverExample;

public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver(subject);
        subject.setState(80);
        subject.setState(120);

    }

}
