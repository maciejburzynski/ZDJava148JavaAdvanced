package inheritance.family;

public class Son extends Family{
    @Override
    public void walk() {
        System.out.print("Before leg day ");
        super.walk();
    }
}
