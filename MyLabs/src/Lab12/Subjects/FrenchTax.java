package Lab12.Subjects;

import Lab12.Components.Product;
import Lab12.Observers.Observer;

import java.util.ArrayList;

public class FrenchTax implements TaxSystem, Subject {

    private ArrayList<Observer> observers = new ArrayList();
	private double taxRate = 12.3; 
	
	public double getTaxRate() {
		return taxRate;
	}

    public double calculateTax(Product p) {
        this.notifyObservers(p.cost(), p.cost() * taxRate);
        return p.cost() * taxRate;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(double productPrice, double taxAmount) {
        for (Observer o : observers)
            o.update(productPrice, taxAmount);
    }

}
