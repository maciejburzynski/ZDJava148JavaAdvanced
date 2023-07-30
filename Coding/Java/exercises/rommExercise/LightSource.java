package exercises.rommExercise;

public class LightSource {

    private int bulbsNumber;
    private BulbType lightSourceType;

    private int energeyConsumptionPerBulb;

    private double totalEnergyConsumption(){
        return bulbsNumber * energeyConsumptionPerBulb;
    }

    public LightSource(int bulbsNumber, BulbType lightSourceType, int energeyConsumptionPerBulb) {
        this.bulbsNumber = bulbsNumber;
        this.lightSourceType = lightSourceType;
        this.energeyConsumptionPerBulb = energeyConsumptionPerBulb;
    }
}
