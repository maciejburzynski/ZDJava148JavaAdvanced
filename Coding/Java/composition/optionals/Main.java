package composition.optionals;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        Car car = null;
//        Car car1 = new Car();
//
//        System.out.println(car1.equals(car));
//        System.out.println(car.equals(car1));
//
//        car.equals(null) = all fine
//        null.equals(car) = NullPointerException błąd

        Car car = null;
        Car car1 = new Car();

        System.out.println(car1.equals(car));

//        Optional
        Car car2 = null;
        Optional<Car> carOptional = Optional.ofNullable(car2);

        if (car2 != null) {
            car2.equals(car1);
        }

//        Optional ifPresent method
        carOptional.ifPresent(a -> a.drive());

//        Optional isPresent method
        if (carOptional.isPresent()) {
            carOptional.get().equals(car1);
        }

//        Optional<Car> get method returns car inside of Optional
//        carOptional.get();

//        Create Set with 1 element from Optional
        Set<Car> carSet = carOptional.stream()
                .collect(Collectors.toSet());

//        Exception
        System.out.println("Exception: ");
        carOptional.orElseThrow(
                () -> new CarNotFoundException("Car not found"));

//        Optional/Exception
        carOptional.ifPresentOrElse(
                a -> a.drive(),
                () -> new CarNotFoundException("IfPresentOrElse car not found"));
//        Try catch is not required because we throw Exception extending RuntimeException

    }
}
