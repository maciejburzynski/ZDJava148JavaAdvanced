package composition;

public class Car {

    private String make;
    private String model;
    private String color;
    private String registration;
    private String vin;

    private GearBox gearBox;
    private WindScreen windScreen;
    public Car() {
    }

    public Car(String make, String model, String color, String registration, String vin, GearBox gearBox, WindScreen windScreen) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.registration = registration;
        this.vin = vin;
        this.gearBox = gearBox;
        this.windScreen = windScreen;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", registration='" + registration + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }

}
