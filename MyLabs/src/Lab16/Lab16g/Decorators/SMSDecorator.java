package Lab16.Lab16g.Decorators;

import Lab16.Lab16g.Composite.Recepient;
import Lab16.Lab16g.Message;

public class SMSDecorator extends NotifierDecorator {
    private Notifier notifier;

    public SMSDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(Message message, Recepient recepient) {
        notifier.send(message.complete("Sent with SMS / "), recepient);
    }
}
