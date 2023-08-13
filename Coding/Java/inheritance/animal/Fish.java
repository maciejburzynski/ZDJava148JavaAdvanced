package inheritance.animal;

public class Fish extends Animal {

    @Override
    void breathe() {
        System.out.println("I am breathing as a Fish!"); // not necessary - by deafult using Animal implementation
    }

    @Override
    void eat() {
        System.out.println("I am eating small fishes!");
    }
}