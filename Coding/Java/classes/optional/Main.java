package classes.optional;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Car car = null;

        Car car1 = new Car();
        System.out.println(car1.equals(car));
        System.out.println(car.equals(car1));


        System.out.println(car1.equals(car));



        Car car2 = null;
        Optional<Car>carOptional = Optional.ofNullable(car2);

        if(car2 == null){
            car2.equals(car1);
        }


        if(carOptional.isPresent()){
            carOptional.get().equals(car1);

        }

        carOptional.get();


        Set<Car> carSet = carOptional.stream()
                .collect(Collectors.toSet());

        carOptional.orElseThrow(() ->new RuntimeException("Car not found"));
    }

}
