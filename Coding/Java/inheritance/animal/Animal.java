package inheritance.animal;

public abstract class Animal {
//    you can't create an object of abstract class

    void breathe() {
        System.out.println("I am breathing!");
    }

    abstract void eat();
}
