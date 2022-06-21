package Ex1.Factories;

import Ex1.Doors.Door;
import Ex1.Walls.Wall;
import Ex1.Windows.Window;

// House factory = Concrete factory

public interface HouseFactory {

    public Wall createWall();
    public Door createDoor();
    public Window createWindow();

}
