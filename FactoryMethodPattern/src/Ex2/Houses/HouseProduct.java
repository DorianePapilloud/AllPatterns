package Ex2.Houses;

import Ex2.Walls.WallCreator;

/**
 * Lab 4
 * @author scz
 */
public abstract class HouseProduct {
    
    protected String name = "";
    protected WallCreator southWall;
    protected WallCreator northWall;
    protected WallCreator westWall;
    protected WallCreator eastWall;
            
    public void buildHouse() {
        southWall = createWall();
        northWall = createWall();
        westWall = createWall();
        eastWall = createWall();

        southWall.bindTo(westWall);
        westWall.bindTo(southWall);

        westWall.bindTo(northWall);
        northWall.bindTo(westWall);

        northWall.bindTo(eastWall);
        eastWall.bindTo(northWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);
    }

    public void calculatePrice() {
        System.out.println("Total price of " + this.name + " is " + getHousePrice());
    }

    private int getHousePrice() {
        return southWall.getPrice() + westWall.getPrice() + northWall.getPrice() + eastWall.getPrice();
    }

    protected abstract WallCreator createWall();

}
