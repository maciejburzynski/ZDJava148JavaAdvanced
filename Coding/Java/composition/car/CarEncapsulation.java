package composition.car;

import static composition.car.Color.*;

public class CarEncapsulation {

    public static void main(String[] args) {

        Car car = new Car("Renault",
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


        System.out.println("Before: ");
        System.out.println(car.getColor());
        System.out.println("Car painting...");
        System.out.println("3...");
        System.out.println("2...");
        System.out.println("1...");
        System.out.println("After: ");
        car.setColor(ORANGE.getStringValue());
        System.out.println(car.getColor());


    }
}
