package Lab16.Lab16g.Composite;

import Lab16.Lab16g.Message;

public class Individual implements Recepient {
    String name;

    public Individual(String name) {
        this.name = name;
    }

    @Override
    public void receives(Message message) {
        System.out.println(name + " receives a message " + message);
    }
}
