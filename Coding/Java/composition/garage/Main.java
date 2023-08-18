package composition.garage;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Lumper pingPongTable = new Lumper("ping pong table",150,false,Size.LARGE);
        Lumper playStation4 = new Lumper("playstation 4", 1200,false,Size.SMALL);
        Lumper bicycles = new Lumper("bicycles",1050,true,Size.MEDIUM);
        Lumper tools = new Lumper("tools" , 450,false,Size.SMALL);
        Lumper furniture = new Lumper("furniture",900,false,Size.EXTRA_LARGE);
        Lumper kitchenware = new Lumper("kitchenware",320,false,Size.SMALL);

        Garage garage01 = new Garage(1, 2.5,3.2,5.6,true,2,true);
        Garage garage02 = new Garage(2, 2.5,3.2,5.6,true,2,true);
        Garage garage03 = new Garage(3, 2.0,2.2,5.0,false,1,false);
        Garage garage04 = new Garage(4, 1.9,2.1,5.2,false,3,true);
        Garage garage05 = new Garage(5, 2.7,2.5,6.2,true,1,false);
        Garage garage06 = new Garage(6, 2.9,2.2,4.9,false,1,false);
        Garage garage07 = new Garage(7, 3.0,3.0,6.3,true,3,true);
        Garage garage08 = new Garage(8, 2.4,3.0,6.1,false,2,true);

        //creating garage arraylist and adding each garage to list
        List<Garage> garages = new ArrayList<>();
        garages.add(garage01);
        garages.add(garage02);
        garages.add(garage03);
        garages.add(garage04);
        garages.add(garage05);
        garages.add(garage06);
        garages.add(garage07);
        garages.add(garage08);
        //adding lumpers to garages

        garage01.addLumper(pingPongTable);
        garage01.addLumper(bicycles);
        garage01.addLumper(tools);

        garage02.addLumper(playStation4);
        garage02.addLumper(furniture);

        garage03.addLumper(kitchenware);

        garage04.addLumper(bicycles);
        garage04.addLumper(furniture);
        garage04.addLumper(pingPongTable);
        garage04.addLumper(tools);

        garage05.addLumper(kitchenware);

        garage06.addLumper(tools);

        garage07.addLumper(playStation4);
        garage07.addLumper(pingPongTable);

        System.out.println("Printing heated garages: ");
        for(Garage garage : garages){
            if(garage.isHeated()){
                System.out.println(garage.getGarageNum());
            }
        }
        System.out.println();
        System.out.println("Printing garages that contain a total value of lumpers over 1500 $: ");
        for(Garage garage : garages){
            if(garage.getSummaryLumpersValue() > 1500){
                System.out.println("Garage nr: " + garage.getGarageNum() + " includes lumpers of total value " +
                        garage.getSummaryLumpersValue());
            }
        }
        System.out.println();

        System.out.println("Printing garages that contain 2 parking spaces at least");
        for(Garage garage : garages){
            if(garage.getNumOfParkingSpaces() >= 2){
                System.out.println("Garage nr: " + garage.getGarageNum() + " has at least 2 parking spaces");
            }
        }




    }
}
