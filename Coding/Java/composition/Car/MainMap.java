package composition.Car;

import composition.Car.Car;
import composition.Car.Color;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
// set

    public static void main(String[] args) {
//      Create 3 cars
        Car car = new Car("Renault",
                "Twingo",
                Color.BLUE,
                "EL00100",
                "4Y1SL65848Z411439");
        Car car1 = new Car("Mazda",
                "6",
                Color.RED,
                "EL11040",
                "4Y1SL65848Z411435");
        Car car2 = new Car("Mercedes",
                "GLE",
                Color.BLACK,
                "EL12100",
                "4Y1SL65848Z411432");


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
