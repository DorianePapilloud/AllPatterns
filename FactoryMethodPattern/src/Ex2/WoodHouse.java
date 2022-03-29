package Ex2;

/**
 * Lab 4
 * @author scz
 */
public class WoodHouse extends House {
    
    public WoodHouse() {
        this.name = "Swiss wood chalet";
    }

    @Override
    protected Wall createWall() {
        return new WoodWall();
    }
    
}
