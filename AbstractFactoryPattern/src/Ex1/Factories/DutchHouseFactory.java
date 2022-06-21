package Ex1.Factories;

import Ex1.Doors.Door;
import Ex1.Doors.LargeDoor;
import Ex1.Walls.BricksWall;
import Ex1.Walls.Wall;
import Ex1.Windows.Window;
import Ex1.Windows.WindowToTheFloor;

public class DutchHouseFactory implements HouseFactory {

    public Wall createWall() {
        return new BricksWall();
    }

    public Door createDoor() {
        return new LargeDoor();
    }

    public Window createWindow() {
        return new WindowToTheFloor();
    }

}
