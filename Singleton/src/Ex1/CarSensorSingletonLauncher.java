package Ex1;

import Ex1.SensorManagers.*;
import Ex1.Sensors.RoadConditionSensor;
import Ex1.Sensors.SpeedSensor;
import Ex1.Sensors.TemperatureSensor;

public class CarSensorSingletonLauncher {
    public CarSensorSingletonLauncher() {
    }

    public static void main(String[] args) {
        CarSensorSingletonLauncher launcher
                = new CarSensorSingletonLauncher();
        launcher.launch();
    }

    public void launch() {
        this.test(SimpleSingletonSensorsManager.getInstance());
        this.test(SynchSingletonSensorsManager.getInstance());
        this.test(EagerSingletonSensorsManager.getInstance());
        this.test(DbleCheckedLockingSingletonSensorsManager.getInstance());
    }
    private void test(SingletonSensorManager manager) {
        manager.addSensor(new TemperatureSensor());
        manager.addSensor(new SpeedSensor());
        manager.addSensor(new RoadConditionSensor());
        manager.printState();
    }

}
