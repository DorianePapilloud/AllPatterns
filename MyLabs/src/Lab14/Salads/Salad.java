package Lab14.Salads;

public abstract class Salad {

	protected String description;

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract String prepare();
	
	public abstract double cost();
			

}
