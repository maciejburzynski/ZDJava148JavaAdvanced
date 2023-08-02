package car;

public class Main {
    public static void main(String[] args) {
        Car ferrari = Car.FERRARI;
        Car mercedes = Car.MERCEDES;
        Car opel = Car.OPEL;

        System.out.println(ferrari.isPremium()); // true
        System.out.println(mercedes.isRegular()); // false

        ferrari.isFasterThan(mercedes); // Ferrari jest szybszy od Mercedes
        opel.isFasterThan(mercedes);    // Opel nie jest szybszy od Mercedes
    }
}
