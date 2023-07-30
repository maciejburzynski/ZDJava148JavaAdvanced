package composition;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        //      Create 3 cars
        Car car = new Car("Renault",
                "Twingo",
                "Blue",
                "EL00100",
                "4Y1SL65848Z411439", gearBox, windScreen);
        Car car1 = new Car("Mazda",
                "6",
                "Red",
                "EL11040",
                "4Y1SL65848Z411435", gearBox, windScreen);
        Car car2 = new Car("Mercedes",
                "GLE",
                "Black",
                "EL12100",
                "4Y1SL65848Z411432", gearBox, windScreen);

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
