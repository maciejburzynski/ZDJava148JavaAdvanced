package composition.homework.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Lumper chair = new Lumper("Chair", 34, false, Size.SMALL);
        Lumper antiqueLamp = new Lumper("Antique lamp", 150, false, Size.SMALL);
        Lumper tiresComplet = new Lumper("Complet of tires", 123, false, Size.MEDIUM);
        Lumper oldFridge = new Lumper("Old fridge", 45, true, Size.LARGE);
        Lumper oldCar = new Lumper("Poldek", 430, true, Size.EXTRA_LARGE);
        Lumper rustyFlashlight = new Lumper("Rusty flashlight", 10, false, Size.SMALL);
        Lumper brokenPocketWatch = new Lumper("Broken pocket watch", 20, true, Size.SMALL);
        Lumper brokenCeramicTiles = new Lumper("Broken ceramic tiles", 15, true, Size.SMALL);
        Lumper deflatedBasketball = new Lumper("Deflated basketball", 10, true, Size.SMALL);
        Lumper antiqueCamera = new Lumper("Antique camera", 200, false, Size.MEDIUM);
        Lumper vintageRadio = new Lumper("Vintage radio", 80, false, Size.MEDIUM);
        Lumper fadedCarpet = new Lumper("Faded carpet", 50, true, Size.LARGE);
        Lumper bicycle = new Lumper("Bicycle", 70, false, Size.LARGE);
        Lumper oldWoodenChest = new Lumper("Old wooden chest", 120, true, Size.EXTRA_LARGE);


        Garage garage = new Garage(10, 13, 9, true, false, true, true, 10, List.of(chair, oldWoodenChest, oldFridge, bicycle, fadedCarpet));
        Garage garage2 = new Garage(15, 20, 8, false, true, false, false, 17, List.of(antiqueCamera, vintageRadio, fadedCarpet, bicycle));
        Garage garage3 = new Garage(12, 25, 11, true, true, true, false, 9, List.of(oldFridge, oldCar, rustyFlashlight, brokenPocketWatch, brokenCeramicTiles));
        Garage garage4 = new Garage(43, 19, 7, false, false, false, false, 12, List.of(bicycle, oldWoodenChest, chair, antiqueLamp, tiresComplet));
        Garage garage5 = new Garage(17, 22, 10, true, false, true, true, 8, List.of(tiresComplet, oldFridge, oldCar, rustyFlashlight, brokenPocketWatch));
        Garage garage6 = new Garage(32, 15, 12, false, true, false, false, 11, List.of(fadedCarpet, bicycle, oldWoodenChest, chair, antiqueLamp));
        Garage garage7 = new Garage(19, 21, 9, true, true, false, true, 14, List.of(brokenPocketWatch, brokenCeramicTiles, deflatedBasketball, antiqueCamera, vintageRadio));
        Garage garage8 = new Garage(23, 14, 8, true, false, true, false, 15, List.of(vintageRadio, fadedCarpet, bicycle, oldWoodenChest, chair));
        Garage garage9 = new Garage(34, 18, 6, false, false, false, true, 13, List.of(chair, antiqueLamp, tiresComplet, oldFridge, oldCar));
        Garage garage10 = new Garage(20, 17, 11, true, true, true, true, 16, List.of(rustyFlashlight, brokenPocketWatch, brokenCeramicTiles, deflatedBasketball, antiqueCamera));
        Garage garage11 = new Garage(22, 16, 7, false, true, false, false, 10, List.of(bicycle, antiqueCamera, brokenCeramicTiles, oldWoodenChest, oldFridge));


        List<Garage> garages = new ArrayList();

        garages.add(garage);
        garages.add(garage2);
        garages.add(garage3);
        garages.add(garage4);
        garages.add(garage5);
        garages.add(garage6);
        garages.add(garage7);
        garages.add(garage8);
        garages.add(garage9);
        garages.add(garage10);
        garages.add(garage11);


        System.out.println("-----------------------------");
        System.out.println("Wyświetlamy ogrzewane garaże.");
        System.out.println("-----------------------------");

        for (Garage gar : garages) {
            if (gar.isHeated()) {
                System.out.println(gar);
            }
        }

        System.out.println("-----------------------------");
        System.out.println("Wyświetlamy  garaże w których wartości rupieci jest większa od 400 pln.");
        System.out.println("-----------------------------");


        for (Garage gar1 : garages) {
            if ((gar1.lumpersTotalPrice()) > 400) {
                System.out.println(gar1);
            }
        }

        System.out.println("-----------------------------");
        System.out.println("Wyświetlamy  garaże które mają dwa miejsca parkingowe lub więcej.");
        System.out.println("-----------------------------");

        for (Garage gar3 : garages) {
            if (gar3.getNumberOfParkingSpaces() >= 2) {
                System.out.println(gar3);
            }}

        System.out.println("-----------------------------");
        System.out.println("Wyświetlamy  garaże które nie mają okien.");
        System.out.println("-----------------------------");

        for (Garage gar4 : garages) {
            if (gar4.isHaveWindows()==false) {
                System.out.println(gar4);
            }}

        System.out.println("-----------------------------");
        System.out.println("Poniżej zrobimy to wszystko za pomocą streamów.");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("Poniżej wyświetlimny za pomocą streama garaże które są ogrzewane");
        System.out.println("-----------------------------");


            garages.stream()
                    .filter(gar -> gar.isHeated())
                    .forEach(System.out::println);



        System.out.println("-----------------------------");
        System.out.println("Wyświetlamy za pomocą streama  garaże w których wartości rupieci jest większa od 400 pln.");
        System.out.println("-----------------------------");

        garages.stream()
                .filter(gar -> gar.lumpersTotalPrice() > 400)
                .forEach(System.out::println);


        System.out.println("-----------------------------");
        System.out.println("Wyświetlamy  garaże które mają dwa miejsca parkingowe lub więcej.");
        System.out.println("-----------------------------");

        garages.stream()
                .filter(gar -> gar.getNumberOfParkingSpaces() >=2)
                .forEach(System.out::println);


        System.out.println("-----------------------------");
        System.out.println("Wyświetlamy za pomocą streama  garaże które nie mają okien.");
        System.out.println("-----------------------------");

        garages.stream()
                .filter(gar -> gar.isHaveWindows() ==false)
                .forEach(System.out::println);

        }}







