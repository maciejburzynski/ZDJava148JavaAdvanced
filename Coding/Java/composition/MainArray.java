package composition;

import java.awt.*;

public class MainArray {
// tablica

    public static void main(String[] args) {
//      Create 3 cars
        Car car = new Car("Renault",
                "Twingo",
                "Blue",
                "EL00100",
                "4Y1SL65848Z411439",
                new GearBox("Bosch", 5, Type.MANUAL),
                new WindScreen("Blue", 20000, "Szybpol") );
        Car car1 = new Car("Mazda",
                "6",
                "Red",
                "EL11040",
                "4Y1SL65848Z411435",
                new GearBox("Makita", 6, Type.MANUAL),
                new WindScreen("Black", 100000, "JapGlass") );
        Car car2 = new Car("Mercedes",
                "GLE",
                "Black",
                "EL12100",
                "4Y1SL65848Z411432",
                new GearBox("Bosch", 5, Type.AUTO),
                new WindScreen("Clear", 30000, "SzybenMachen") );

//      Putting cars into Array and displaying
        Car[] cars = {car, car1, car2};


        System.out.println("------------Array-----------------");
        for (Car iCar : cars) {
            System.out.println(iCar);

        }
    }
}
