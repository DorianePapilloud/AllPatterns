package Lab12.Components;

public abstract class Product {

	private String description;
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public abstract double cost();
}
