package Ex1.Sensors;


public class RoadConditionSensor implements ISensor {
    
    private static final String desc = "Road condition sensor is running...";
    
    public RoadConditionSensor() {
    }

    public String getDescription() {
        return desc;
    }

    public String toString() {
        return this.getDescription();
    }
}
