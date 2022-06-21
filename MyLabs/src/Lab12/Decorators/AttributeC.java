package Lab12.Decorators;

import Lab12.Components.Product;

public class AttributeC extends AttributeDecorator {
	Product product;
 
	public AttributeC(Product product) {
		this.product = product;
	}
 
	public String getDescription() {
		return product.getDescription() + " + Attribute C";
	}
 
	public double cost() {
		return product.cost() + 130;
	}
}
