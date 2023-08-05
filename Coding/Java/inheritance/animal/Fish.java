package inheritance.animal;

import inheritance.player.DvdPlayer;

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


// Animal
// Fish
// Saltwater / Freshwater