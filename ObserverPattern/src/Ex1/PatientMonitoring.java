package Ex1;

import java.util.ArrayList;
import java.util.List;

public class PatientMonitoring implements SubjectPatMoni{

    private List<ObserverMedEmp> observerMedEmpList = new ArrayList<>();
    private int roomNumber, bloodPressure, oximetry;

    public PatientMonitoring(int roomNumber, int bloodPressure, int oximetry) {
        this.roomNumber = roomNumber;
        this.bloodPressure = bloodPressure;
        this.oximetry = oximetry;
    }

    public void setPosition(int roomNumber) {
        this.roomNumber = roomNumber;
        this.notifyObserver(Problem.NO_PROBLEM);
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
        if(bloodPressure > 120){
            this.notifyObserver(Problem.BLOOD_PRESSURE);
        }
        else {
            this.notifyObserver(Problem.NO_PROBLEM);
        }
    }

    public void setPulseOximetry(int oximetry) {
        this.oximetry = oximetry;
        if(oximetry > 100 || oximetry < 95){
            this.notifyObserver(Problem.OXIMETRY);
        }
        else {
            this.notifyObserver(Problem.NO_PROBLEM);
        }
    }

    @Override
    public void registerObserver(ObserverMedEmp observerMedEmp) {
        observerMedEmpList.add(observerMedEmp);
    }

    @Override
    public void removeObserver(ObserverMedEmp observerMedEmp) {
        observerMedEmpList.remove(observerMedEmp);
    }

    @Override
    public void notifyObserver(Problem problem) {
        for (ObserverMedEmp medEmp : observerMedEmpList) {
            medEmp.update(problem);
        }
    }
}
