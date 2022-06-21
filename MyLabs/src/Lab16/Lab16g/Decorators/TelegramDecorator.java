package Lab16.Lab16g.Decorators;

import Lab16.Lab16g.Composite.Recepient;
import Lab16.Lab16g.Message;

public class TelegramDecorator extends NotifierDecorator {
    private Notifier notifier;

    public TelegramDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(Message message, Recepient recepient) {
        notifier.send(message.complete("Encrypted and sent with Telegram / "), recepient);
    }
}
