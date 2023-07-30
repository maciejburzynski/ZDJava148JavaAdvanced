package streams;

import composition.car.Car;
import composition.car.GearBox;
import composition.car.Type;
import composition.car.WindScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static composition.car.Color.BLACK;


import static composition.car.Color.BLUE;
import static composition.car.Color.RED;

public class MainArray {
// tablica

    public static void main(String[] args) {
//      Create 3 cars
        composition.car.Car car = new composition.car.Car("Renault",
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
        composition.car.Car car1 = new composition.car.Car("Mazda",
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
        composition.car.Car car2 = new composition.car.Car("Mercedes",
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
        composition.car.Car car3 = new composition.car.Car("Opel",
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

        composition.car.Car car4 = new composition.car.Car("Renault",
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
        composition.car.Car car5 = new composition.car.Car("Mazda",
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
        composition.car.Car car6 = new composition.car.Car("Mercedes",
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

        List<composition.car.Car> carList = new ArrayList<>();

        carList.add(car);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);

        for (Car cars : carList
        ) {
            System.out.println(cars);
        }

        List<Car> blackCars = new ArrayList<>();

//        for(Car carr :carList){
//            if (carr.getColor().equals((BLACK.getStringValue()))){
//                blackCars.add(carr);
//            }
//        }

        List<Car> blackCarsUsingStream = carList.stream()
                .filter(carrr->car.getColor().equals(BLACK.getStringValue()))
                .collect(Collectors.toList());

        System.out.println(blackCarsUsingStream);
    }

}


