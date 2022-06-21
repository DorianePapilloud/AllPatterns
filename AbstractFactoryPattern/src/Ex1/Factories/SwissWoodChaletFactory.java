package Ex1.Factories;

import Ex1.Doors.Door;
import Ex1.Doors.ThinDoor;
import Ex1.Walls.Wall;
import Ex1.Walls.WoodWall;
import Ex1.Windows.Window;
import Ex1.Windows.WindowWithStructure;

public class SwissWoodChaletFactory implements HouseFactory {

    public Wall createWall() {
        return new WoodWall();
    }

    public Door createDoor() {
        return new ThinDoor();
    }

    public Window createWindow() {
        return new WindowWithStructure();
    }

}
