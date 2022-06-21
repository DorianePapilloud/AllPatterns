package Lab12;

import Lab12.Components.Product;
import Lab12.Components.ProductOne;
import Lab12.Components.ProductTwo;
import Lab12.Decorators.AttributeA;
import Lab12.Decorators.AttributeB;
import Lab12.Decorators.AttributeC;
import Lab12.Observers.FrenchEconomicMinistery;
import Lab12.Observers.FrenchFinancialMinistery;
import Lab12.Subjects.FrenchTax;
import Lab12.Subjects.SwissTax;

public class Run {
	public static void main(String[] args) throws Exception {
        SwissTax swissTax = new SwissTax();
        FrenchTax frenchTax = new FrenchTax();

        frenchTax.registerObserver(new FrenchEconomicMinistery());
        frenchTax.registerObserver(new FrenchFinancialMinistery());

		TaskController taskControllerSwiss = new TaskController(swissTax);
		TaskController taskControllerFrench = new TaskController(frenchTax);

		Product product = new ProductOne();
		product = new AttributeA(product);
		product = new AttributeC(product);
		
		taskControllerSwiss.addToOrder(product);
		taskControllerFrench.addToOrder(product);
		
		product = new ProductTwo();
		product = new AttributeB(product);
		
		taskControllerSwiss.addToOrder(product);
		taskControllerFrench.addToOrder(product);
		
		taskControllerSwiss.takeOrder();
		taskControllerFrench.takeOrder();
	}
}
