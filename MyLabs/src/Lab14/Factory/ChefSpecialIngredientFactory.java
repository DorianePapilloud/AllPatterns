package Lab14.Factory;

import Lab14.Ingredients.*;

public class ChefSpecialIngredientFactory implements SaladIngredientFactory {

	@Override
	public CucumberIngredient createCucumber() {
		return new BigCucumber();
	}

	@Override
	//This is different from the other one !
	public SaladIngredient createSalad() {
		return new ChineseLettuce();
	}

	@Override
	public TomatoIngredient createTomato() {
		return new CherryTomato();
	}

	@Override
	public String getDescription() {
		return "Special Chef type";
	}

}
