package Ex2;

import Ex2.Commands.*;
import Ex2.Invoker.Menu;
import Ex2.Receiver.TextFile;

public class Main {


    public static void main(String[] args) {

        Menu menu = new Menu();
        TextFile text1 = new TextFile("Japon");
        TextFile text2 = new TextFile("Venise");

        menu.setCommand(0, new CloseTextFileCommand());
        menu.setCommand(1, new CopyTextFileCommand());
        menu.setCommand(2, new PasteTextFileCommand());
        menu.setCommand(3, new OpenTextFileCommand());
        menu.setCommand(4, new SaveTextFileCommand());

        menu.callMenuItem(1, text1);
        menu.callMenuItem(2, text2);
        menu.callMenuItem(0, text1);
        menu.callMenuItem(3, text1);
        menu.callMenuItem(4, text2);
    }


}
