package Ex1.Sensors;

public class TemperatureSensor implements ISensor {
    
    private static final String desc = "Temperature sensor is running...";
    
    public TemperatureSensor() {
    }

    public String getDescription() {
        return desc;
    }

    public String toString() {
        return this.getDescription();
    }
}
