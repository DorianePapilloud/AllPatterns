package Lab16.Lab16g.Decorators;

import Lab16.Lab16g.Composite.Recepient;
import Lab16.Lab16g.Message;

public class CoreNotifier implements Notifier {
    @Override
    public void send(Message message, Recepient recepient) {
        recepient.receives(message.complete("Sent on the computer / "));
    }
}
