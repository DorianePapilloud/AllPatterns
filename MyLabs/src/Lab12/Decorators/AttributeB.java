package Lab12.Decorators;

import Lab12.Components.Product;

public class AttributeB extends AttributeDecorator {
	Product product;
 
	public AttributeB(Product product) {
		this.product = product;
	}
 
	public String getDescription() {
		return product.getDescription() + " + Attribute B";
	}
 
	public double cost() {
		return product.cost() + 120;
	}
}
