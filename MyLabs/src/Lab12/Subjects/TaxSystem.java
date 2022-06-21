package Lab12.Subjects;

import Lab12.Components.Product;

public interface TaxSystem {

	double getTaxRate();
    double calculateTax(Product p);
}
