package Lab14.Decorators;

import Lab14.Salads.Salad;

public class Olives extends SaladDecorator {

	private Salad mySalad;
	
	public Olives(Salad salad){
		this.mySalad = salad;
	}
		
	@Override
	public double cost(){
		return mySalad.cost() + 1;
	}

	@Override
	public String prepare() {
		return mySalad.prepare() + " + Olives ";		
	}



}
