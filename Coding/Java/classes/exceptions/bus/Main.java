package classes.exceptions.bus;

public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus("Cucumber", true);
        Bus bus1 = new Bus("Ikarus", false);


        try {
            validateBus(bus);
        } catch (BusIsCrushedException exception) {
            System.out.println("aaaaaaaa");
        } finally {
            System.out.println("I am going to buy it anyway!");
        }


        try {
            validateBus(bus1);
        } catch (BusIsCrushedException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("I am going to buy it anyway!");

        }


    }

    private static void validateBus(Bus bus) throws BusIsCrushedException {
        if (bus.getCrushed()) {
            throw new BusIsCrushedException("This bus was crushed!");
        } else {
            System.out.println("This bus is so cool!");
        }
    }
}
