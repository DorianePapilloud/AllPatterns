package Lab12;

import Lab12.Components.Product;
import Lab12.Subjects.TaxSystem;

public class TaskController {

	private SalesOrder salesOrder;

	public TaskController(TaxSystem taxSystem)
	{
		salesOrder = new SalesOrder() ;
        salesOrder.setTax(taxSystem) ;
	}
	
	public void addToOrder(Product product)
	{
		salesOrder.addProduct(product);
	}
	
	public void takeOrder() throws Exception
	{
		salesOrder.processOrder();
	}
	
}
