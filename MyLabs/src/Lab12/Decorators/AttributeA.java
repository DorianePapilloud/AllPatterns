package Lab12.Decorators;

import Lab12.Components.Product;

public class AttributeA extends AttributeDecorator {
	Product product;
 
	public AttributeA(Product product) {
		this.product = product;
	}
 
	public String getDescription() {
		return product.getDescription() + " + Attribute A";
	}
 
	public double cost() {
		return product.cost() + 100;
	}
}
