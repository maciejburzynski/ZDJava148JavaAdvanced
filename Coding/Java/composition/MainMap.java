package composition;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {

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

        Map<String, Car> stringCarMap = new HashMap<>();

        stringCarMap.put("Jarek", car1);
        stringCarMap.put("Zdzisiek", car2);
        stringCarMap.put("Misiek", car);


        System.out.println();
        System.out.println("Jarek Cars");
        System.out.println(stringCarMap.get("Jarek"));

        System.out.println();
        System.out.println("Zdzisiek Cars");
        System.out.println(stringCarMap.get("Zdzisiek"));

        System.out.println();
        System.out.println("--------Size------");
        System.out.println(stringCarMap.size());


        Map <String, String> capitolsCountries = new HashMap<>();
        capitolsCountries.put("Poland", "Warsaw");
        capitolsCountries.put("Germany", "Berlin");
        capitolsCountries.put("France", "Paris");
        capitolsCountries.put("Madryt", "Spain");
        capitolsCountries.put("Italy", "Rome");



    }
}
