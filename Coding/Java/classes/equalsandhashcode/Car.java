package classes.equalsandhashcode;

import java.util.Objects;

public class Car {

    private String Make;
    private String Model;
    private String Vin;


    public Car(String make, String model, String vin) {
        Make = make;
        Model = model;
        Vin = vin;
    }


    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getVin() {
        return Vin;
    }

    public void setVin(String vin) {
        Vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(Make, car.Make) && Objects.equals(Model, car.Model) && Objects.equals(Vin, car.Vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Make, Model, Vin);
    }



    /*

    Server (Java/Code) --> OBJECT (timestamp) -----> Service ---------> OBJECT


     */






}
