package Lab16.Lab16g.Decorators;

import Lab16.Lab16g.Composite.Recepient;
import Lab16.Lab16g.Message;

public class WhatsAppDecorator extends NotifierDecorator {
    private Notifier notifier;

    public WhatsAppDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(Message message, Recepient recepient) {
        notifier.send(message.complete("Sent with WhatsApp / "), recepient);
    }
}
