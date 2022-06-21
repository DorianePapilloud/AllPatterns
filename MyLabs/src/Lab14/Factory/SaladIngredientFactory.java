package Lab14.Factory;

import Lab14.Ingredients.CucumberIngredient;
import Lab14.Ingredients.SaladIngredient;
import Lab14.Ingredients.TomatoIngredient;

public interface SaladIngredientFactory {

	SaladIngredient createSalad();
	CucumberIngredient createCucumber();
	TomatoIngredient createTomato();
	String getDescription();
}
