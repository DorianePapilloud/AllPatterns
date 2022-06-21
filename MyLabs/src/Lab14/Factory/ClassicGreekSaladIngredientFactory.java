package Lab14.Factory;

import Lab14.Ingredients.*;

public class ClassicGreekSaladIngredientFactory implements SaladIngredientFactory {

	@Override
	public CucumberIngredient createCucumber() {
		return new BigCucumber();
	}

	@Override
	public SaladIngredient createSalad() {
		return new IcebergSalad();
	}

	@Override
	public TomatoIngredient createTomato() {
		return new CherryTomato();
	}

	@Override
	public String getDescription() {
		return "Classic type";
	}

}
