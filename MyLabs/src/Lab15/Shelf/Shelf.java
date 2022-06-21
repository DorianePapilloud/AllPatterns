package Lab15.Shelf;

import Lab15.Books.IBook;
import Lab15.Commands.Command;

public class Shelf implements IShelf {

	private Command leftCommand;
	private Command rightCommand;
	private Command undoCommand;

	public Shelf(Command leftCommand, Command rightCommand) {
		this.leftCommand = leftCommand;
		this.rightCommand = rightCommand;
	}
	
	public void left() {
		leftCommand.execute();
		undoCommand = leftCommand;
	}
	
	public void right() {
		rightCommand.execute();
		undoCommand = rightCommand;
	}
	
	public void undo() {
		undoCommand.execute();
	}
	
	public void setLeftCommand(Command leftCommand) {
		this.leftCommand = leftCommand;
	}

	public void setRightCommand(Command rightCommand) {
		this.rightCommand = rightCommand;
	}
	
	public void select(IBook book) {
		leftCommand.setBook(book);
		rightCommand.setBook(book);
	}

}
