package Lab14;

import Lab14.Decorators.Olives;
import Lab14.Decorators.Paprika;
import Lab14.Factory.ChefSpecialIngredientFactory;
import Lab14.Factory.ClassicGreekSaladIngredientFactory;
import Lab14.Salads.GreekSalad;
import Lab14.Salads.Salad;

import java.util.Scanner;

public class TestSalad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Greek Salad Palace : enter your preferred salad type");
		String type = input.nextLine();
		
		Salad s1 = null;

		if(type.equals("Classic"))
			s1 = new GreekSalad(new ClassicGreekSaladIngredientFactory());
		else if(type.equals("Chef Special"))
			s1 = new GreekSalad(new ChefSpecialIngredientFactory());
		else{
			System.out.println("We don't have that, sorry");
			System.exit(0);
		}
				
		//Add some random toppings
		s1 = new Olives(new Olives(new Paprika(s1)));
		
		System.out.println(s1.prepare());

		System.out.println("Cost of your salad : " + s1.cost());

	}

}
