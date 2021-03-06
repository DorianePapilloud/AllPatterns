package Lab14.Salads;

import Lab14.Factory.SaladIngredientFactory;
import Lab14.Ingredients.*;

public class GreekSalad extends Salad {

	private SaladIngredientFactory saladIngredientFactory;
	private CucumberIngredient cucumberIngredient;
	private CheeseIngredient cheeseIngredient;
	private SaladIngredient saladIngredient;
	private TomatoIngredient tomatoIngredient;
	
	public GreekSalad(SaladIngredientFactory ingredientFactory){
		setDescription("Greek Salad");
		this.saladIngredientFactory = ingredientFactory;
	}
	
	public double cost(){
		return 12;
	}
	
	public String prepare(){
		this.saladIngredient = saladIngredientFactory.createSalad();
		this.cucumberIngredient = saladIngredientFactory.createCucumber();
		this.tomatoIngredient = saladIngredientFactory.createTomato();
		
		//This is always feta in a greek salad
		this.cheeseIngredient = new Feta();
		
		return this.description + " " + saladIngredientFactory.getDescription();
	}

	public SaladIngredientFactory getIngredientFactory() {
		return saladIngredientFactory;
	}

	public void setIngredientFactory(SaladIngredientFactory ingredientFactory) {
		this.saladIngredientFactory = ingredientFactory;
	}
}
