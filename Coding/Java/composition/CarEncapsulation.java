package composition;

import java.awt.*;

public class CarEncapsulation {

    public static void main(String[] args) {
        Car car = new Car("Renault",
                "Twingo",
                Color.BLUE,
                "EL00100",
                "4Y1SL65848Z411439");


        System.out.println("Before: ");
        System.out.println(car.getColor());
        System.out.println("Car painting...");
        System.out.println("3...");
        System.out.println("2...");
        System.out.println("1...");
        System.out.println("After: ");
        car.setColor(Color.ORANGE);
        System.out.println(car.getColor());


    }
}