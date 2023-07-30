package composition;

public class GearBox {

    private String producer;
    private int numberOfGears;
    private Type type;

    public GearBox(String producer, int numberOfGears, Type type) {
        this.producer = producer;
        this.numberOfGears = numberOfGears;
        this.type = type;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
