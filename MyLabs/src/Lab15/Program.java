package Lab15;

import Lab15.Books.Book;
import Lab15.Books.Group;
import Lab15.Books.IBook;
import Lab15.Commands.Command;
import Lab15.Commands.CommandCounter;
import Lab15.Commands.LeftCommand;
import Lab15.Commands.RightCommand;
import Lab15.Shelf.IShelf;
import Lab15.Shelf.Shelf;

public class Program {

    /**
     * @param args
     */
    public static void main(String[] args) {

        IBook book1 = new Book("Lord of the Rings", 1);
        IBook book2 = new Book("La Bible de Jérusalem", 5);
        IBook book3 = new Book("Les Frères Karamazov", 2);
        IBook book4 = new Book("Guerre et Paix", 1);
        IBook book5 = new Book("Utopia", 2);

        Group group1 = new Group();
        group1.add(book1);
        group1.add(book3);
        group1.add(book4);
        group1.add(book5);

        Group group2 = new Group();
        group2.add(group1);
        group2.add(book2);

        Command leftCmd = new CommandCounter(new LeftCommand(book1));
        Command rightCmd = new CommandCounter(new RightCommand(book1));

        IShelf shelf = new Shelf(leftCmd, rightCmd);
        System.out.println(group2.toString());

        shelf.right();
        System.out.println(group2.toString());

        shelf.select(group1);
        shelf.left();
        System.out.println(group2.toString());

        shelf.select(group2);
        shelf.right();
        System.out.println(group2.toString());

        shelf.undo();
        System.out.println(group2.toString());

        shelf.select(book2);
        shelf.right();
        System.out.println(group2.toString());

        System.out.println("Number of Undos " + CommandCounter.getNumberOfUndos());

    }

}
