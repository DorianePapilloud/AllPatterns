package Ex2;

/**
 * Lab 4
 * @author scz
 */
public class GlassHouse extends House {
    
    public GlassHouse() {
        this.name = "Moder German house";
    }

    @Override
    protected Wall createWall() {
        return new GlassWall();
    }
    
}
