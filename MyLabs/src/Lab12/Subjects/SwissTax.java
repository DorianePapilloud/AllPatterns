package Lab12.Subjects;

import Lab12.Components.Product;

public class SwissTax implements TaxSystem {

	private double taxRate = 7.6; 
	
	public double getTaxRate() {
		return taxRate;
	}

    public double calculateTax(Product p) {
        return p.cost() * taxRate;
    }

}
