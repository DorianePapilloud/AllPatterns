package Lab15.Commands;


import Lab15.Books.IBook;

public class LeftCommand implements Command {

	private IBook myBook;
	
	public LeftCommand(IBook book) {
		this.myBook = book;
	}
	
	public void execute() {
		myBook.setLeft();
		myBook.move();
	}

	public void undo() {
		myBook.setRight();
		myBook.move();
	}

	public void setBook(IBook book) {
		this.myBook = book;
	}


}
