package inheritance.animal;

public class Fish extends Animal{
    @Override
    void breathe() {
        System.out.println("I am breathing as a fish!");
    }

    @Override
    void eat() {
        System.out.println("I am eating small fishes!");
    }
}
