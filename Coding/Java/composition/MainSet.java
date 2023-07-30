package composition;

import java.util.HashSet;
import java.util.Set;

import static composition.Color.*;

public class MainSet {
// set

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


        Set<Car> carSet = new HashSet<>();
        carSet.add(car);
        carSet.add(car);
        carSet.add(car1);
        carSet.add(car2);

        System.out.println("------------Set-----------------");
        System.out.println("------------Whole set:-----------------");
        System.out.println(carSet);

        System.out.println("------------Does set contain Car2?-----------------");
        System.out.println(carSet.contains(car2));

        System.out.println("------------Can we remove Car? if true, will be removed-----------------");
        System.out.println(carSet.remove(car));

        System.out.println("------------Please clear and display empty carSet-----------------");
        carSet.clear();
        System.out.println(carSet);


// no get() method
// no order
// no duplicates

    }
}
