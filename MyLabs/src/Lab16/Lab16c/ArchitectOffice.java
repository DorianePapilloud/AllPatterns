package Lab16.Lab16c;

import Lab16.Lab16c.Constructions.Chalet;
import Lab16.Lab16c.Constructions.Construction;
import Lab16.Lab16c.Constructions.FlatHouse;

public class ArchitectOffice {

	public static void main(String[] args) {
		Construction chalet = new Chalet();
		chalet.constructHouse();
		Construction flatsHouse = new FlatHouse();
		flatsHouse.constructHouse();
	}
}
