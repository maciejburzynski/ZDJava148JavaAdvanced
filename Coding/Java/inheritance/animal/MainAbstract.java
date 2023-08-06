package inheritance.animal;

public class MainAbstract {

    public static void main(String[] args) {

        Animal lion = new Lion();
        Animal fish = new Fish();
        Animal frog = new Frog();

        fish.breathe();
        fish.eat();

        lion.breathe();
        lion.eat();

        frog.breathe();
        frog.eat();


    }
}
