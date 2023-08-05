package Homework.taskGarage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Lumper> lumpers = new ArrayList<>();
        lumpers.add(new Lumper(1100, true, Size.SMALL));
        lumpers.add(new Lumper(1600, false, Size.MEDIUM));

        List<Lumper> lumpers2 = new ArrayList<>();
        lumpers2.add(new Lumper(100, true, Size.SMALL));
        lumpers2.add(new Lumper(600, false, Size.MEDIUM));

        List<Lumper> lumpers3 = new ArrayList<>();
        lumpers3.add(new Lumper(3200, true, Size.MEDIUM));
        lumpers3.add(new Lumper(5100, false, Size.LARGE));

        List<Garage> garages = new ArrayList<>();
        garages.add(new Garage(5.5, 3.0, 2.5, true, true, false, 1, lumpers));
        garages.add(new Garage(7.0, 2.0, 3.5, false, true, true, 3, lumpers2));
        garages.add(new Garage(12.0, 3.0, 4.0, false, true, false, 7, lumpers3));



        List<Garage> filteredGarages = new ArrayList<>();
        for (Garage garage : garages) {
            if (garage.isHeated() && garage.getParkingSpace() >= 2 && !garage.isWindowed()) {
                double lumpersValue = garage.getLumpers().stream()
                        .filter(lumper -> lumper.getValue() > 1500)
                        .mapToDouble(Lumper::getValue)
                        .sum();
                if (lumpersValue > 1500) {
                    filteredGarages.add(garage);
                }


            }
        }
        List<Garage> filteredGaragesStream = garages.stream()
                .filter(Garage::isHeated)
                .filter(garage -> garage.getParkingSpace() >= 2)
                .filter(garage -> !garage.isWindowed())
                .filter(garage -> garage.getLumpers().stream()
                        .mapToDouble(Lumper::getValue)
                        .sum() > 1500)
                .collect(Collectors.toList());

        List<Lumper> allLumpers = garages.stream()
                .flatMap(garage -> garage.getLumpers().stream())
                .collect(Collectors.toList());

        List<Lumper> sortedByName = allLumpers.stream()
                .sorted(Comparator.comparing(lumper -> lumper.getSize().toString()))
                .collect(Collectors.toList());

        List<Lumper> sortedByValue = allLumpers.stream()
                .sorted(Comparator.comparingDouble(Lumper::getValue).reversed())
                .collect(Collectors.toList());
        System.out.println("Filtered Garages (Loop):");
        for (Garage garage : filteredGarages) {
            System.out.println("Garage: " + garage.getParkingSpace() + " parking spaces");
        }

        System.out.println("\nFiltered Garages (Stream):");
        for (Garage garage : filteredGaragesStream) {
            System.out.println("Garage: " + garage.getParkingSpace() + " parking spaces");
        }

        System.out.println("\nSorted Lumpers (Alphabetically):");
        for (Lumper lumper : sortedByName) {
            System.out.println("Lumper: " + lumper.getSize() + ", Estimated Value: " + lumper.getValue());
        }

        System.out.println("\nSorted Lumpers (By Value - High to Low):");
        for (Lumper lumper : sortedByValue) {
            System.out.println("Lumper: " + lumper.getSize() + ", Estimated Value: " + lumper.getValue());
        }
    }
}


