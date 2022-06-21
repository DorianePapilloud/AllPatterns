package Lab16.Lab16g;

import Lab16.Lab16g.Composite.Individual;
import Lab16.Lab16g.Composite.Recepient;
import Lab16.Lab16g.Composite.RecepientGroup;
import Lab16.Lab16g.Decorators.*;


public class NotificationTests {
    public static void main(String[] args) {
        // Setting the company hierarchy:
        Recepient marc = new Individual("Marc");
        Recepient matthieu = new Individual("Matthieu");
        Recepient luc = new Individual("Luc");
        Recepient jean = new Individual("Jean");

        RecepientGroup humanRessourcesDepartment = new RecepientGroup();
        humanRessourcesDepartment.add(marc);
        humanRessourcesDepartment.add(matthieu);

        RecepientGroup itDepartment = new RecepientGroup();
        itDepartment.add(luc);
        itDepartment.add(jean);

        RecepientGroup company = new RecepientGroup();
        company.add(itDepartment);
        company.add(humanRessourcesDepartment);

        // Setting the notification mecanisms:
        // Creating a message
        System.out.println("------- 1ST NOTIFICATION --------");
        Notifier notifier = new CoreNotifier();
        notifier.send(new Message("IT IS TIME TO EAT."), marc);

        System.out.println("------- 2ND NOTIFICATION --------");
        notifier = new SMSDecorator(notifier);
        notifier.send(new Message("DO YOU WANT TO JOIN DINNER?"), humanRessourcesDepartment);

        System.out.println("------- 3RD NOTIFICATION --------");
        notifier = new WhatsAppDecorator(new TelegramDecorator(notifier));
        notifier.send(new Message("WE ARE GOING TO PLAY FOOTBALL!"), company);

    }
}
