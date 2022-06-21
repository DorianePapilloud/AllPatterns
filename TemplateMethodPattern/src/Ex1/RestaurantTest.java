package Ex1;

import Ex1.Templates.ItalianRestaurant;
import Ex1.Templates.Restaurant;
import Ex1.Templates.SwissRestaurant;

public class RestaurantTest {
    public static void main(String[] args) {
            Restaurant ilGolossone = new ItalianRestaurant("Il Golossone - Zürich");
            Restaurant leVieuxChalet = new SwissRestaurant("Le Vieux Chalet - Gruyères");
            ilGolossone.prepareDinner();
            leVieuxChalet.prepareDinner();
    }
}
