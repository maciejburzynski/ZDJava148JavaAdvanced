package composition.Car;

import composition.Car.Car;
import composition.Car.Color;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
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
