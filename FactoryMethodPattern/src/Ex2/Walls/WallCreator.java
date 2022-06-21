package Ex2.Walls;

import java.util.ArrayList;
import java.util.List;

public abstract class WallCreator {
    protected String name;
    protected int price;
    private List<WallCreator> neighbours = new ArrayList<WallCreator>();;

    
    public void bindTo(WallCreator w) {
        neighbours.add(w);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
