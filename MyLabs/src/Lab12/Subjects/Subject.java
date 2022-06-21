package Lab12.Subjects;

import Lab12.Observers.Observer;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(double productPrice, double taxAmount);
}
