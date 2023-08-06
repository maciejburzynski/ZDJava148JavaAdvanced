package classes.exceptions.exercise;

public class Main {

    public static void main(String[] args) {

        Bus bus1 = new Bus("Setra", false);
        Bus bus2 = new Bus("Jelcz", true);
        Bus bus3 = new Bus("Ikarus", false);

        System.out.println("----------Walidacja busa 1:----------");
        try {
            validateBus(bus1);
        } catch (BusIsCrashedException abcd) {
            System.out.println(abcd.getMessage());
        } finally { // Wykona się zawsze po przypadku z catcha
            System.out.println("Ale i tak go kupuję! // info z finally");
        }

        System.out.println("----------Walidacja busa 2:----------");
        try {
            validateBus(bus2);
        } catch (BusIsCrashedException abcd) {
            System.out.println(abcd.getMessage());
        } finally {
            System.out.println("Ale i tak go kupuję! // info z finally");
        }

        System.out.println("----------Walidacja busa 3:----------");
        try {
            validateBus(bus3);
        } catch (BusIsCrashedException abcd) {
            System.out.println(abcd.getMessage());
        } finally {
            System.out.println("Ale i tak go kupuję! // info z finally");
        }


    }

    private static void validateBus(Bus bus) throws BusIsCrashedException {
        if (bus.getIsCrashed()) {
            throw new BusIsCrashedException("Skasowany, mordo! // info z if throw new");
        } else {
            System.out.println("Ten bus jest gituwa! // info z if else");
        }
    }
}
