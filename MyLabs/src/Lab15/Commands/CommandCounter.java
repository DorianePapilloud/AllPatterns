package Lab15.Commands;

import Lab15.Books.IBook;

public class CommandCounter implements Command {

	private Command myCommand;
	static int numberOfUndos;
	
	public CommandCounter(Command command) {
		this.myCommand = command;
	}

	public void execute() {
		myCommand.execute();
	}

	public void undo() {
		myCommand.undo();
		numberOfUndos++;
	}

	public void setBook(IBook book) {
		myCommand.setBook(book);
	}

	public static int getNumberOfUndos() {
		return numberOfUndos;
	}

	
}
