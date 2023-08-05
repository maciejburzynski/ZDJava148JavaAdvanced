package composition.garage;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        Set<Lumper> lumperSet = new HashSet<>();
        lumperSet.add(new Lumper("Lumper", 100.00, true, Size.SMALL));
        lumperSet.add(new Lumper("Lumper", 350.90, false, Size.LARGE));
        lumperSet.add(new Lumper("Lumper", 150.00, false, Size.SMALL));
        lumperSet.add(new Lumper("Lumper", 150.00, false, Size.SMALL));
        lumperSet.add(new Lumper("Lumper", 123.00, false, Size.MEDIUM));
        lumperSet.add(new Lumper("Lumper", 45.00, true, Size.LARGE));
        lumperSet.add(new Lumper("Lumper", 430.00, true, Size.LARGE));

        Set<Lumper> lumperSet1 = new HashSet<>();
        lumperSet1.add(new Lumper("Lumper", 123.00, false, Size.MEDIUM));
        lumperSet1.add(new Lumper("Lumper", 45.00, true, Size.LARGE));
        lumperSet1.add(new Lumper("Lumper", 430.00, true, Size.LARGE));

        Set<Lumper> lumperSet2 = new HashSet<>();
        lumperSet2.add(new Lumper("Lumper", 100.00, true, Size.SMALL));
        lumperSet2.add(new Lumper("Lumper", 350.90, false, Size.LARGE));
        lumperSet2.add(new Lumper("Lumper", 150.00, false, Size.SMALL));

        Garage garage3 = new Garage(
                10.00,
                5.00,
                2.00,
                true,
                false,
                true,
                true,
                1,
                lumperSet);

        Garage garage1 = new Garage(
                10.00,
                5.00,
                2.00,
                false,
                false,
                false,
                true,
                3,
                lumperSet1);

        Garage garage2 = new Garage(
                10.00,
                5.00,
                2.00,
                true,
                true,
                true,
                false,
                2,
                lumperSet2);

        List<Garage> allGarages = new ArrayList<>();
        allGarages.add(garage3);
        allGarages.add(garage1);
        allGarages.add(garage2);

        System.out.println("------------------------All garages without iterating:");
        System.out.println(allGarages);

        System.out.println("------------------------All garages using stream for each method:");
        allGarages.stream()
                .forEach(System.out::println); // consumer -> gets object, returns void

//        Garaże ogrzewane
        System.out.println("------------------------Heated garages:");
        List<Garage> heatedGarages = allGarages.stream()
                .filter(garage -> garage.getIsHeated() == true) // predicate -> gets object, returns boolean
                .collect(toList());
        System.out.println(heatedGarages);

//        2 miejsca parkingowe i więcej
        System.out.println("------------------------More than 2 parking spots:");
        List<Garage> moreThanTwoCarSpots = allGarages.stream()
                .filter(garage -> garage.getNumberOfParkingSpots() > 2)
                .collect(toList());
        System.out.println(moreThanTwoCarSpots);

//        nie posiadają okien
        System.out.println("------------------------Garages with no windows:");
        List<Garage> noWindowGarages = allGarages.stream()
                .filter(garage -> garage.getWindow() == false)
                .collect(toList());
        System.out.println(noWindowGarages);

//        Lumpers
        List<Lumper> lumperList = new ArrayList<>();
        lumperList.add(new Lumper("pocztówka", 100.00, true, Size.SMALL));
        lumperList.add(new Lumper("pocztówka", 350.90, false, Size.LARGE));
        lumperList.add(new Lumper("pocztówka", 150.00, false, Size.SMALL));
        lumperList.add(new Lumper("pocztówka", 150.00, false, Size.SMALL));
        lumperList.add(new Lumper("karta", 123.00, false, Size.MEDIUM));
        lumperList.add(new Lumper("karta", 45.00, true, Size.LARGE));
        lumperList.add(new Lumper("karta", 430.00, true, Size.LARGE));

        System.out.println("Unsorted: ");
        System.out.println(lumperList);

        System.out.println("Sorted alphabetically: ");
        lumperList.sort(Comparator.comparing(a -> a.getName()));
        System.out.println(lumperList);

        System.out.println("Sorted per value: ");
        lumperList.sort(Comparator.comparingDouble(a -> a.getEstimatedValue()));
        System.out.println(lumperList);
    }
}
