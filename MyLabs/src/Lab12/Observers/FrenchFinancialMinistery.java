package Lab12.Observers;

public class FrenchFinancialMinistery implements Observer {

    public void update(double productPrice, double taxAmount) {
        System.out.print("French financial ministery has been informed about transaction with product price ");
        System.out.println(productPrice + " and tax amount " + taxAmount);
    }

}
