package Exceptions.Exercise;


public class Main {
    public static void main(String[] args) throws BusCrashException {

        Busior busior = new Busior("Żuk", true);
        Busior busior1 = new Busior("Dostawczak", false);
        Busior busior2 = new Busior("Chlodnia", true);

        try {
            CheckIsCrushed(busior);
        } catch (BusCrashException e) {    // tutaj wywołujemy komunikat z metody
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Does not matter, i will buy it");
        }

        try {
            CheckIsCrushed(busior1);
        } catch (BusCrashException e) {
            System.out.println("This bus is crushed");
        } finally {
            System.out.println("Does not matter, i will buy it");
        }

        try {
            CheckIsCrushed(busior2);
        } catch (BusCrashException e) {
            System.out.println("This bus is crushed");     // tutaj wywołujemyu komunikat z try catcha
        } finally {
            System.out.println("Does not matter, i will buy it");
        }

    }


    private static void CheckIsCrushed(Busior busio) throws BusCrashException {
        if (busio.isCrushed()) {
            throw new BusCrashException("This bus is crush");
        } else {
            System.out.println("All good!");
        }
    }
}
