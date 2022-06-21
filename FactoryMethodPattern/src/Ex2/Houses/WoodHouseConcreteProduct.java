package Ex2.Houses;

import Ex2.Walls.WallCreator;
import Ex2.Walls.WoodWallConcreteCreator;

public class WoodHouseConcreteProduct extends HouseProduct {
    
    public WoodHouseConcreteProduct() {
        this.name = "Swiss wood chalet";
    }

    @Override
    protected WallCreator createWall() {
        return new WoodWallConcreteCreator();
    }
    
}
