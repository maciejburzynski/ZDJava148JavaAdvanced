package inheritance.animal;

import java.util.ArrayList;
import java.util.List;

public class MainAbstract {
    public static void main(String[] args) {
// Polymorphism
// wiele form

        Animal lion = new Lion();
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

    }

// - Interfaces and abstract classes are similar and getting more similar.
//   Both can have default implementation and fields BUT
// - One class can extend only one class, but can implements as
//   many interfaces as you wish//
}
