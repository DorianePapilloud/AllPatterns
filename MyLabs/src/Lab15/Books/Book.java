package Lab15.Books;

public class Book implements IBook {

	int horizontalPosition = 0;
	int direction = 1; // 1 is right, -1 is left
	int steps = 1;
	String name;
	
	public Book(String name, int steps) {
		this.steps = steps;
		this.name = name;
	}
	
	public void move() {
		horizontalPosition = horizontalPosition + steps * direction;
	}
	
	public void setRight() {
		direction = +1;
	}
	
	public void setLeft() {
		direction = -1;
	}
	
	public String toString() {
		return " Position " + horizontalPosition + " direction " + ((direction == 1) ? " right " : " left ") + " steps " + steps + " Book " + name;
	}

}
