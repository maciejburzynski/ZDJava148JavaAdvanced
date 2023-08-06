package inheritance.animal;

public class Lion extends Animal{


    @Override
    void breathe() {
        super.breathe();
    }

    @Override
    void eat() {
        System.out.println("I am eating antelopes!");
    }
}
