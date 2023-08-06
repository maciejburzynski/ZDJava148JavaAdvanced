package inheritance.animal;

public class Frog extends Animal{

    @Override
    void breathe() {
        super.breathe(); // using Animal implementation
    }

    @Override
    void eat() {
        System.out.println("I am eating flies");
    }
}
