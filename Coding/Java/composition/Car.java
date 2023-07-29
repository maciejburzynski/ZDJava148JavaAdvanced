package composition;

public class Car {

    String make;
    String model;
    String color;
    String registration;
    String vin;

    public Car() {
    }

    public Car(String make, String model, String color, String registration, String vin) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.registration = registration;
        this.vin = vin;
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
