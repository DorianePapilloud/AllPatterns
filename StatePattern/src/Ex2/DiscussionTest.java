package Ex2;

import Ex2.Context.Person;

public class DiscussionTest {

	public static void main(String[] args) {
		Person jean = new Person();
		jean.enter();
		jean.leave();
		jean.ask();
		jean.enter();
		jean.ask();
		jean.leave();
		jean.enter();
		jean.ask();
		jean.handOver();
		jean.over();
		jean.leave();
	}
}
