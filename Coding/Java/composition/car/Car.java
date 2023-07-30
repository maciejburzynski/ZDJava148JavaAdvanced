package composition.car;


public class Car {
// protected
// public
// private
// package-private - by default if no there is no modifier

    private String make;
    private String model;
    private String color;
    private String rejestracja;
    private String vin;
    private GearBox gearBox;
    private WindScreen windScreen;


    public Car() {
    }

    public Car(String make,
               String model,
               String color,
               String rejestracja,
               String vin,
               GearBox gearBox,
               WindScreen windScreen) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.rejestracja = rejestracja;
        this.vin = vin;
        this.gearBox = gearBox;
        this.windScreen = windScreen;
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

    public String getRejestracja() {
        return rejestracja;
    }
  
    public void setRejestracja(String rejestracja) {
        this.rejestracja = rejestracja;
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
                ", registration='" + rejestracja + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }

}
