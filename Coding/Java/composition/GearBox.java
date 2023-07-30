package composition;

public class GearBox {
    private String model;
    private int numberOfGears;

    public GearBox(String model, int numberOfGears, Type type) {
        this.model = model;
        this.numberOfGears = numberOfGears;
        this.type = type;
    }

    private Type type;
}
