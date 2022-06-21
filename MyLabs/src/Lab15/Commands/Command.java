package Lab15.Commands;

import Lab15.Books.IBook;

public interface Command {
	void execute();
	void undo();
	void setBook(IBook book);
}
