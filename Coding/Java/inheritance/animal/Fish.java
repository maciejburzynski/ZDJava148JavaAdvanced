package inheritance.animal;

public class Fish extends Animal{
    @Override
    void breathe() {
        System.out.println("I am eating as a Fish!");

        // super.breathe(); // not necessary - by default using animal implementation
        // super - odniesienie do klasy nadrzędnej
    }
    @Override
    void eat() {
        System.out.println("I am eating small fishes!");
    }
}

//@Override
//    void breathe() {
//        System.out.println("I am breathing as a Fish!");
////        super.breathe(); // super - odniesienie do klasy nadrzędnej
//    }