package composition.streams;

import composition.car.Car;
import composition.car.GearBox;
import composition.car.Type;
import composition.car.WindScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static composition.car.Color.*;
import static composition.car.Color.BLACK;

public class Main {
//  Streams
    /*
    - Streams are lazy, but it is good for application
    performance -> They perform an action only when they have to

    - cleaner code
     */

    public static void main(String[] args) {
        Car car7 = new Car("Renault",
                "Twingo",
                BLACK.getStringValue(),
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
        Car car3 = new Car("Opel",
                "Vectra",
                BLACK.getStringValue(),
                "HPF12100",
                "4Y1SL65848C411432",
                new GearBox("Bosch",
                        6,
                        Type.MANUAL),
                new WindScreen(BLACK.getStringValue(),
                        "Pilkington",
                        25000));

        Car car4 = new Car("Renault",
                "Clio",
                BLUE.getStringValue(),
                "ES22123",
                "4Y1SL65848Z411437",
                new GearBox("Bosch",
                        5,
                        Type.MANUAL),
                new WindScreen(BLUE.getStringValue(),
                        "Pilkington",
                        20000));
        Car car5 = new Car("Mazda",
                "3",
                RED.getStringValue(),
                "EPI1040",
                "4Y1SL65848Z411435",
                new GearBox("Bosch",
                        6,
                        Type.AUTO),
                new WindScreen(BLUE.getStringValue(),
                        "Pilkington",
                        22000));
        Car car6 = new Car("Mercedes",
                "GLC",
                BLACK.getStringValue(),
                "EL12100",
                "4Y1SL65848Z411432",
                new GearBox("Bosch",
                        7,
                        Type.MANUAL),
                new WindScreen(BLACK.getStringValue(),
                        "Pilkington",
                        25000));

        List<Car> carList = new ArrayList();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        System.out.println("Car List: ");
        System.out.println("_______________________________");
        System.out.println(carList);


// Old school
        List<Car> blackCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.getColor().equals(BLACK.getStringValue())) {
                blackCars.add(car);
            }
        }

        System.out.println("Black cars using old school: ");
        System.out.println(blackCars);

//  New school
        List<Car> blackCarsUsingStream = carList
                .stream()
                .filter(car -> car.getColor().equals(BLACK.getStringValue()))
                .collect(Collectors.toList());

        blackCarsUsingStream.get(0);
        System.out.println("Black cars using streams: ");
        System.out.println(blackCarsUsingStream);

        System.out.println("Multifilter: ");

        carList.stream()
                .filter(car ->  car.getMake().equals("Renault")
                            && car.getColor().equals(BLACK.getStringValue()))
                .forEach(car -> System.out.println(car));


    }

}
