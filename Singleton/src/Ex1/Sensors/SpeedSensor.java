package Ex1.Sensors;

public class SpeedSensor implements ISensor {
    
    private static final String desc = "Speed sensor is running...";
    
    public SpeedSensor() {
    }

    public String getDescription() {
        return desc;
    }

    public String toString() {
        return this.getDescription();
    }
}
