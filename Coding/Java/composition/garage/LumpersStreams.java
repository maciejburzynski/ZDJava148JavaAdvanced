package composition.garage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LumpersStreams {

    public static void main(String[] args) {

        Lumper pingPongTable = new Lumper("ping pong table",150,false,Size.LARGE);
        Lumper playStation4 = new Lumper("playstation 4", 1200,false,Size.SMALL);
        Lumper bicycles = new Lumper("bicycles",1050,true,Size.MEDIUM);
        Lumper tools = new Lumper("tools" , 450,false,Size.SMALL);
        Lumper furniture = new Lumper("furniture",900,false,Size.EXTRALARGE);
        Lumper kitchenware = new Lumper("kitchenware",320,false,Size.SMALL);

        ArrayList<Lumper> lumpers = new ArrayList<>();

        lumpers.add(pingPongTable);
        lumpers.add(playStation4);
        lumpers.add(bicycles);
        lumpers.add(tools);
        lumpers.add(furniture);
        lumpers.add(kitchenware);

        //Alphabetical sorted lumpers using streams
        List<Lumper> alphabeticalSortedLumpers = lumpers
                .stream()
                .sorted(Comparator.comparing(Lumper::getName))
                .collect(Collectors.toList());

        System.out.println(alphabeticalSortedLumpers);

        // Lumpers sorted by value - from cheapest to most expensive
        List<Lumper> sortedLumpersByValue = lumpers
                .stream()
                .sorted(Comparator.comparingInt(Lumper::getEstimatedValue))
                .collect(Collectors.toList());

        System.out.println(sortedLumpersByValue);

    }
}
