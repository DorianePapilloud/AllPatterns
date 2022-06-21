package Lab14.Decorators;

import Lab14.Salads.Salad;

public class Paprika extends SaladDecorator {

	private Salad mySalad;
	
	public Paprika(Salad salad){
		this.mySalad = salad;
	}
	
	@Override
	public double cost() {
		return mySalad.cost() + 0.50;
	}

	@Override
	public String prepare() {
		return mySalad.prepare() + " + Paprika ";
	}



}
