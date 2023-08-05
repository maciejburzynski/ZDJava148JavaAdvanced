package inheritance.animal;

import java.util.ArrayList;
import java.util.List;

public class MainAbstract {
    public static void main(String[] args) {
//        Polymorphism - "Wiele form". Mamy animala i przyjmuje on wiele form

        Animal lion = new Lion();
//      Fish fish = new Animal(); - nie pyknie
        Animal fish = new Fish();
        Animal frog = new Frog();
        List<Animal> animals = new ArrayList<>();

        animals.add(lion);

        fish.breathe();
        fish.eat();

        frog.breathe();
        frog.eat();

        lion.breathe();
        lion.eat();

//        - interfaces and abstract classes are simillar and getting more simillar.
//        both can have default implementation and fields
//        BUT !!!
//        - one class can extend only one class, but can implement
//        as many interfaces as you wish.

    }
}
