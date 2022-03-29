package Ex1;

public class DbleCheckedLockingSingletonSensorsManager extends SingletonSensorManager {


    private static DbleCheckedLockingSingletonSensorsManager uniqueInstance;

    private DbleCheckedLockingSingletonSensorsManager() {}

    public static DbleCheckedLockingSingletonSensorsManager getInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new DbleCheckedLockingSingletonSensorsManager();
        }

        return uniqueInstance;
    }


}
