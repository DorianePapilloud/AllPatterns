package Ex2.Houses;

import Ex2.Walls.GlassWallConcreteCreator;
import Ex2.Walls.WallCreator;

public class GlassHouseConcreteProduct extends HouseProduct {
    
    public GlassHouseConcreteProduct() {
        this.name = "Moder German house";
    }

    @Override
    protected WallCreator createWall() {
        return new GlassWallConcreteCreator();
    }
    
}
