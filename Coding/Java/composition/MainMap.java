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

        Map<String,Car> stringCarMap=new HashMap<>();
        stringCarMap.put("Maciej", car);
        stringCarMap.put("Jacek", car1);
        stringCarMap.put("Andrzej", car2);

        System.out.println("--------Map--------");
        System.out.println("--------Maciej's car is:--------");
        System.out.println(stringCarMap.get("Maciej"));

        System.out.println("--------Map's size is equal to:--------");
        System.out.println(stringCarMap.size());

        System.out.println("--------Is there any car1 as a value?:--------");
        System.out.println(stringCarMap.containsValue(car1));

        System.out.println("--------Set of keys from map:--------");
        System.out.println(stringCarMap.keySet());

    }
}
