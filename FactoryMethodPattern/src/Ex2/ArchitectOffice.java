package Ex2;

import Ex2.Houses.BricksHouseConcreteProduct;
import Ex2.Houses.GlassHouseConcreteProduct;
import Ex2.Houses.HouseProduct;
import Ex2.Houses.WoodHouseConcreteProduct;

public class ArchitectOffice {
    public static void main(String[] args)
    {
        HouseProduct house1 = new GlassHouseConcreteProduct();
        house1.buildHouse();
        house1.calculatePrice();
        HouseProduct house2 = new BricksHouseConcreteProduct();
        house2.buildHouse();
        house2.calculatePrice();
        HouseProduct house3 = new WoodHouseConcreteProduct();
        house3.buildHouse();
        house3.calculatePrice();
    }
}