package composition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainArray {
// tablica

    public static void main(String[] args) {
//      Create 3 cars
        Car car = new Car("Renault",
                "Twingo",
                "Blue",
                "EL00100",
                "4Y1SL65848Z411439");
        Car car1 = new Car("Mazda",
                "6",
                "Red",
                "EL11040",
                "4Y1SL65848Z411435");
        Car car2 = new Car("Mercedes",
                "GLE",
                "Black",
                "EL12100",
                "4Y1SL65848Z411432");

//      Putting cars into Array and displaying
        Car[] cars = {car, car1, car2};


        System.out.println("------------Array-----------------");
        for (Car iCar : cars) {
            System.out.println(iCar);

        }
    }
}
