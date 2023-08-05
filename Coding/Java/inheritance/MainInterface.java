package inheritance;

import java.util.ArrayList;
import java.util.List;

public class MainInterface {
    public static void main(String[] args) {
// Interface name = new ClassImplementingInterface()
        
        List<String> stringList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        FourWheeler bus = new Bus();
        bus.drive();

        FourWheeler truck = new Truck();
        truck.drive();

        FourWheeler automobile = new Automobile();
        automobile.drive();

        List<Bus> buses = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();
        List<Automobile> automobiles = new ArrayList<>();

        List<FourWheeler> fourWheelers = new ArrayList<>();
        fourWheelers.add(bus);
        fourWheelers.add(truck);
        fourWheelers.add(automobile);

        fourWheelers.stream()
                .forEach(fourWheeler -> fourWheeler.drive());




    }
}
