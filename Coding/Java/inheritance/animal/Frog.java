package inheritance.animal;

public class Frog extends Animal {

    @Override
    void breathe() {
        super.breathe();
    }

    @Override
    void eat() {

        System.out.println("I am eating flies");

    }
}
