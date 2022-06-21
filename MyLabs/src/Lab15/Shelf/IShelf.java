package Lab15.Shelf;

import Lab15.Books.IBook;

public interface IShelf {
	void left();
	void right();
	void undo();
	void select(IBook book);
}