package composition.homework.exercise4;

import java.util.*;


public class Zoo  {
    private Map<String, Integer> zoo;

    public Zoo() {
        zoo = new HashMap<>();
    }

    public void addAnimals(String animal, Integer number) {
        zoo.put(animal, number);
    }


    public static void main(String[] args) {


        Zoo zoo = new Zoo();

        zoo.addAnimals("Monkey", 3);
        zoo.addAnimals("Tiger", 2);
        zoo.addAnimals("Zebra", 5);
        zoo.addAnimals("Lion", 2);
        zoo.addAnimals("Turkey", 5);
        zoo.addAnimals("Fox", 3);
        zoo.addAnimals("Horse", 2);


        System.out.println();
        System.out.println("All animals from ZOO : ");
        showAllAnimalsWithQuantities(zoo);

        System.out.println();
        System.out.println("Now we show all animals  number: ");
        System.out.println("Suma: " + getNumberOfAnimals(zoo));

        System.out.println();
        System.out.println("Now we show all animals list, sorted by ascending quantity: ");
        showwAllAnimalsWithQuanitiesSortedAscending(zoo);
    }


    private static int getNumberOfAnimals(Zoo zoo) {
        int suma = zoo.zoo.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
        return suma;
    }

    private static void showAllAnimalsWithQuantities (Zoo zoo) {
        for (Map.Entry<String, Integer> entry : zoo.zoo.entrySet()) {
            String animal = entry.getKey();
            int number = entry.getValue();
            System.out.println(animal + ": " + number);
        }
    }

    private static void showwAllAnimalsWithQuanitiesSortedAscending (Zoo zoo){
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(zoo.zoo.entrySet());
        Collections.sort(sortedList, Map.Entry.comparingByKey());

        for (Map.Entry<String, Integer> entry : zoo.zoo.entrySet()) {
            String animal = entry.getKey();
            int number = entry.getValue();
            System.out.println(animal + ": " + number);
        }
    }

}

    



