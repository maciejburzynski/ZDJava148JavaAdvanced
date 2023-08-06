package Garage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Garage> garages = new ArrayList<>();

        ArrayList<Lumper> lumpers1 = new ArrayList<>();
        lumpers1.add(new Lumper(1000, false, Size.SMALL));
        lumpers1.add(new Lumper(2000, false, Size.MEDIUM));
        Garage garage1 = new Garage(5, 3, 2.5, true, true, false, true,3, lumpers1);
        garages.add(garage1);

        ArrayList<Lumper> lumpers2 = new ArrayList<>();
        lumpers2.add(new Lumper(500, true, Size.LARGE));
        lumpers2.add(new Lumper(3000, false, Size.MEDIUM));
        Garage garage2 = new Garage(6, 4, 3, false, false, true, false,1,  lumpers2);
        garages.add(garage2);

        ArrayList<Garage> filtredGarages = new ArrayList<>();
        for(Garage garage : garages) {
            if(garage.isHeat() && garage.getParkingPlaces() >= 2 && garage.calculateTotalLumpersValue() > 1500) {
                filtredGarages.add(garage);
            }
        }
        System.out.println("Garaże spełniające kryteria:");
        for (Garage garage : filtredGarages) {
            System.out.println(garage.toString());
        }
        ArrayList<Garage> filtredGaragesStream = garages.stream()
                .filter(garage -> garage.isHeat() &&
                        garage.getParkingPlaces() >= 2&&
                        !garage.isWindow() &&
                        garage.calculateTotalLumpersValue() > 1500)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Garaże spełniające kryteria (Streamy):");
        filtredGaragesStream.forEach(System.out::println);

        ArrayList<Lumper> lumpersToSort = new ArrayList<>();
        lumpersToSort.add(new Lumper(200, false, Size.MEDIUM));
        lumpersToSort.add(new Lumper(1500, false, Size.LARGE));
        lumpersToSort.add(new Lumper(500, true, Size.SMALL));

        lumpersToSort.stream()
                .sorted(Comparator.comparing(Lumper::getEstimatedValue).reversed())
                .forEach(System.out::println);
    }
}
