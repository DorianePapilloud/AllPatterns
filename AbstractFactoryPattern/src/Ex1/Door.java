package ch.hevs.design_patterns.house_abstract_factory.lab5_ex1.doors;

import ch.hevs.design_patterns.house_abstract_factory.lab5_ex1.walls.Wall;

/**
 * Lab 5
 * @author scz
 */
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
