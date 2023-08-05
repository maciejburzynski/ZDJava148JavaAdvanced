package composition.car;

import java.util.HashMap;
import java.util.Map;

import static composition.car.Color.*;

/*

    map - mapa

    -
    -
    -
    -

    */

public class MainMap {

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

        Map<String, Car> stringCarMap = new HashMap<>();

        stringCarMap.put("Maciej", car);
        stringCarMap.put("Jacek", car1);
        stringCarMap.put("Andrzej", car2);

        System.out.println("--------------Map---------------");
        System.out.println("--------------Maciej's car is:---------------");
        System.out.println(stringCarMap.get("Maciej"));

        System.out.println("--------------Map's size is equal to:---------------");
        System.out.println(stringCarMap.size());

        System.out.println("--------------Is there any Zbyszek as a key?---------------");
        System.out.println(stringCarMap.containsKey("Zbyszek"));

        System.out.println("--------------Is there any car1 as a value?---------------");
        System.out.println(stringCarMap.containsValue(car1));

        System.out.println("--------------Set of keys from map:---------------");
        System.out.println(stringCarMap.keySet());

        System.out.println("--------------Set of cars from map:---------------");
        System.out.println(stringCarMap.values());

        System.out.println("--------------Country-Capitol map---------------");
        Map<String, String> capitolsCountriesMap = new HashMap<>();
        capitolsCountriesMap.put("Poland", "Warsaw");
        capitolsCountriesMap.put("Germany", "Berlin");
        capitolsCountriesMap.put("France", "Paris");

        System.out.println("--------------Capitol of Poland is:---------------");
        System.out.println(capitolsCountriesMap.get("Poland"));





    }
}
