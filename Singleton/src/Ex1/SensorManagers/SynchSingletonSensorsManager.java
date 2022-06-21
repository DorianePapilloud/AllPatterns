package Ex1.SensorManagers;

public class SynchSingletonSensorsManager extends SingletonSensorManager {

    private static SynchSingletonSensorsManager uniqueInstance;

    private SynchSingletonSensorsManager() {}

    public static synchronized SynchSingletonSensorsManager getInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new SynchSingletonSensorsManager();
        }

        return uniqueInstance;
    }

}
