package inheritance.car;

public class Truck implements FourWheeler {


    @Override
    public void drive() {
        System.out.println("I'm driving a truck!");
    }
}
