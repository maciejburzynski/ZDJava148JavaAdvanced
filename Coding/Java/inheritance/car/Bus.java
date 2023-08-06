package inheritance.car;

public class Bus implements FourWheeler {


    @Override
    public void drive() {
        System.out.println("I'm driving a bus!");
    }
}
