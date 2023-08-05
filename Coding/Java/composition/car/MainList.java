package composition.car;

import java.util.ArrayList;
import java.util.List;

import static composition.car.Color.*;

/*

    Lista

    pros:
    - is ordered
    - duplicates allowed
    - a bit slower than array
    - is flexible - you don't have to define size

    */

public class MainList {
    public static void main(String[] args) {
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

        //      Creating List and putting cars into them
        List<Car> carsList = new ArrayList();
        carsList.add(car);
        carsList.add(car1);
        carsList.add(car2);

        System.out.println("------------List size: -----------------");
        System.out.println(carsList.size());

        System.out.println("------------Does list contain car1?-----------------");
        if (carsList.contains(car1)) {
            System.out.println("Jest byczQ!");
        } else {
            System.out.println("Nie ma byczQ!");
        }

        System.out.println("------------Particular car with index 0: (first element) -----------------");
        System.out.println(carsList.get(0));

        System.out.println("------------Whole List-----------------");
        for (Car lCars : carsList) {
            System.out.println(lCars);
        }
    }
}
