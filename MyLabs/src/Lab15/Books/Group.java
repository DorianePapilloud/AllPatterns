package Lab15.Books;

import java.util.ArrayList;
import java.util.List;

public class Group implements IBook {

	private List<IBook> books = new ArrayList<IBook>();
	
	public void add(IBook book) {
		books.add(book);
	}
	
	public void move() {
		for (IBook a : books) {
			a.move();
		}	
	}

	public void setLeft() {
		for (IBook a : books) {
			a.setLeft();
		}	
	}

	public void setRight() {
		for (IBook a : books) {
			a.setRight();
		}	
	}
	
	public String toString() {
		String output = "";
		for (IBook a : books) {
			output = output + System.getProperty("line.separator") + a.toString();
		}			
		return output;
	}


}
