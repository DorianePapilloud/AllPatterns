package Ex1;

public class PrepareDinnerDemo {
    public static void main(String[] args) {
            Restaurant ilGolossone = new ItalianRestaurant("Il Golossone - Zürich");
            Restaurant leVieuxChalet = new SwissRestaurant("Le Vieux Chalet - Gruyères");
            ilGolossone.prepareDinner();
            leVieuxChalet.prepareDinner();
    }
}
