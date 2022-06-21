package Ex1.Doors;

import Ex1.Walls.Wall;

// Door = Product A
public abstract class Door {

    protected String name;
    protected int price;
    private Wall wall;

    public void buildOnWall(Wall wall) {
        this.wall = wall;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
