package inheritance.family;

public class Daughter extends Family {

    @Override
    public void walk() {
        super.walk();
        System.out.print("(if i'm not drunk) ");
    }
}
