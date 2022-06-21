package Lab15.Commands;

import Lab15.Books.IBook;

public class RightCommand implements Command {

	private IBook myBook;
	
	public RightCommand(IBook book) {
		this.myBook = book;
	}
	
	public void execute() {
		myBook.setRight();
		myBook.move();
	}

	public void undo() {
		myBook.setLeft();
		myBook.move();
	}

	public void setBook(IBook book) {
		this.myBook = book;
	}

}
