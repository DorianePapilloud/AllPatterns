package Ex2.Houses;

import Ex2.Walls.BricksWallConcreteCreator;
import Ex2.Walls.WallCreator;

public class BricksHouseConcreteProduct extends HouseProduct {
    
    public BricksHouseConcreteProduct() {
        this.name = "Typical dutch house";
    }

    @Override
    protected WallCreator createWall() {
        return new BricksWallConcreteCreator();
    }

}
