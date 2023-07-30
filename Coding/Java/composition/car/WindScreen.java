package composition.car;

public class WindScreen {

    private String color;
    private String producer;
    private int weightInGrams;

    public WindScreen(String color, String producer, int weightInGrams) {
        this.color = color;
        this.producer = producer;
        this.weightInGrams = weightInGrams;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }
}
