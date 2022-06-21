package Lab16.Lab16g.Decorators;

import Lab16.Lab16g.Composite.Recepient;
import Lab16.Lab16g.Message;

public interface Notifier {
    void send(Message message, Recepient recepient);
}
