package Ex1;

public class EagerSingletonSensorsManager extends SingletonSensorManager {


    private static EagerSingletonSensorsManager uniqueInstance;

    private EagerSingletonSensorsManager() {}

    public static EagerSingletonSensorsManager getInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new EagerSingletonSensorsManager();
        }

        return uniqueInstance;
    }


}
