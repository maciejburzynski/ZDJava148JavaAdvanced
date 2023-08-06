package inheritance.car;

public interface FourWheeler {
    int i = 0;


    default void drive() {
        System.out.println("I am Driving as a FourWheeler");
    }
}
