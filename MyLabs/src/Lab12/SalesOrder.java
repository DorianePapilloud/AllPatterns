package Lab12;

import Lab12.Components.Product;
import Lab12.Subjects.TaxSystem;

import java.util.ArrayList;

public class SalesOrder {

	private TaxSystem taxSystem;
	private ArrayList<Product> products;
	
	public SalesOrder()
	{
		products = new ArrayList<Product>();
	}

	public void setTax(TaxSystem taxSystem)
	{
		this.taxSystem = taxSystem;
	}
	
	public void processOrder() throws Exception
	{
		if(this.taxSystem == null)
			throw new Exception ("No tax set.");
		
		double tot=0;
		double productPrice;
		double cost;
		double tax;

		System.out.println("Your order (" + taxSystem.getTaxRate() + "% tax) :");
		System.out.println("------------------------------\n") ;

        for (Product product : products)
		{
			cost = product.cost();
    		tax = taxSystem.calculateTax(product);
			productPrice = cost + tax;
			tot += productPrice;
			
			System.out.println("-  " + product.getDescription()) ;
			System.out.println("   CHF " + cost + " + " + tax + " tax = " + productPrice) ;
			System.out.println("");
		}
		
		System.out.println("----------------------------");
		System.out.println("Total : " + tot) ;
		System.out.println("");
	}
	
	public void addProduct(Product product)
	{
		products.add(product);
	}

}
