package composition;

public class Car {
    //package-private
    // protected
    //public
    //private
    //package-private - by default if no there is no modifier
    private String make;
   private String model;
   private Color color;
   private String registration;
   private String vin;


    public Car() {
    }

    public Car(String make, String model, String color, String registration, String vin) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.registration = registration;
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
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
