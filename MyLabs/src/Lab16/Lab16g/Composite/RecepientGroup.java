package Lab16.Lab16g.Composite;

import Lab16.Lab16g.Message;

import java.util.ArrayList;
import java.util.List;

public class RecepientGroup implements Recepient {
    List<Recepient> recepients = new ArrayList<Recepient>();

    public void add(Recepient recepient) {
        recepients.add(recepient);
    }

    @Override
    public void receives(Message message) {
        for(Recepient recepient : recepients) {
            recepient.receives(message);
        }
    }
}
