package inheritance.animal;

public abstract class Animal {
    // nie można stworzyć instancji tej klasy!

    void breathe(){
        System.out.println("I'm breathing!");
    }

    abstract void eat();

}
