package homework.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle(2017, 7173361, Car.PORSCHE);
        Vehicle car1 = new Vehicle(2023, 6159196, Car.FIAT);
        Vehicle car2 = new Vehicle(2013, 4354446, Car.OPEL);
        Vehicle car3 = new Vehicle(2019, 9047796, Car.FERRARI);
        Vehicle car4 = new Vehicle(2003, 7085476, Car.BMW);
        Vehicle car5 = new Vehicle(2010, 5368066, Car.TOYOTA);
        Vehicle car6 = new Vehicle(2011, 8641386, Car.MERCEDES);

        List<Vehicle> cars = new ArrayList();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);


        System.out.println("-----------------");
        System.out.println("Przed sortowaniem:");
        System.out.println("-----------------");

        cars.stream().
                forEach(System.out::println);

        Collections.sort(cars);

        System.out.println("-----------------");
        System.out.println("Po sortowaniu uznajemy że samochód im nowszy tym szybszy");
        System.out.println("-----------------");

        cars.stream().
                forEach(System.out::println);

        System.out.println();

        System.out.println("Teraz sprawdzimy z jakiej półki są auta: ");
        System.out.println();

        System.out.println(car.toString());
        car.getCar().isPremium();
        System.out.println();  System.out.println(car.toString());
        car.getCar().isPremium();
        System.out.println();


        car1.getCar().isPremium();
        car2.getCar().isPremium();
        car3.getCar().isPremium();
        car4.getCar().isPremium();
        car5.getCar().isPremium();
        car6.getCar().isPremium();

        car1.getCar().isRegular();
        car2.getCar().isRegular();
        car3.getCar().isRegular();
        car4.getCar().isRegular();
        car5.getCar().isRegular();
        car6.getCar().isRegular();


    }




}
