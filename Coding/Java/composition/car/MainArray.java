package composition.car;

import static composition.car.Color.*;

public class MainArray {
    /*

    array - tablica

    pros:
    - fast
    cons:
    - not too many methods
    - not able to stream through arrays without conversion to array
    - working with array is not intuitive
    - not flexible  - you have to define size

    */

    public static void main(String[] args) {
//      Create 3 cars
        Car car = new Car("Renault",
                "Twingo",
                BLUE.getStringValue(),
                "EL00100",
                "4Y1SL65848Z411439",
                new GearBox("Bosch",
                        5,
                        Type.MANUAL),
                new WindScreen(BLUE.getStringValue(),
                        "Pilkington",
                        20000));
        Car car1 = new Car("Mazda",
                "6",
                RED.getStringValue(),
                "EL11040",
                "4Y1SL65848Z411435",
                new GearBox("Bosch",
                        6,
                        Type.AUTO),
                new WindScreen(BLUE.getStringValue(),
                        "Pilkington",
                        22000));
        Car car2 = new Car("Mercedes",
                "GLE",
                BLACK.getStringValue(),
                "EL12100",
                "4Y1SL65848Z411432",
                new GearBox("Bosch",
                        7,
                        Type.MANUAL),
                new WindScreen(BLACK.getStringValue(),
                        "Pilkington",
                        25000));

//      Putting cars into Array and displaying
        Car[] cars = {car, car1, car2};

        System.out.println("------------Array-----------------");
        for (Car iCar : cars) {
            System.out.println(iCar);
        }
        System.out.println("------------Array length-----------------");
        int i = cars.length;
        System.out.println(i);

        System.out.println("------------Array - particular element with index 1 -----------------");
        System.out.println(cars[1]);
    }
}
