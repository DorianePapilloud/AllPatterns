package Ex1;

public interface SubjectPatMoni {

    void registerObserver(ObserverMedEmp observerMedEmp);
    void removeObserver(ObserverMedEmp observerMedEmp);
    void notifyObserver(Problem problem);

}
