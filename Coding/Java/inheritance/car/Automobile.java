package inheritance.car;

public class Automobile implements FourWheeler {

    @Override
    public void drive() {
        System.out.println("I am driving an Automobile!");
    }
}
