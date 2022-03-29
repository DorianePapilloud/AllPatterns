package Ex1;

//concreteObserver

public class MedicalEmployee implements ObserverMedEmp{

    private PatientMonitoring patientMonitoring;
    String name;

    public MedicalEmployee(String name, PatientMonitoring patientMonitoring) {
        this.name = name;
        this.patientMonitoring = patientMonitoring;
        patientMonitoring.registerObserver(this);
    }

    @Override
    public void update(Problem problem) {
        if(problem == Problem.NO_PROBLEM){
            System.out.println("No problem with " + name);
        }
        if(problem == Problem.BLOOD_PRESSURE){
            System.out.println("Problem with blood pressure for " + name);
        }

        if(problem == Problem.OXIMETRY){
            System.out.println("Problem with oximetry for " + name);
        }
    }
}
