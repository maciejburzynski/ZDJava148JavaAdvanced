package homework.exerciseSelfMade.OPTIONAL;


import java.util.*;
import java.util.function.ToIntFunction;



public class Main {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(123);
        listNumbers.add(456);
        listNumbers.add(789);
        listNumbers.add(213);
        listNumbers.add(324);
        listNumbers.add(435);

        Optional<List<Integer>> numberOptional = Optional.ofNullable(listNumbers);

        if (numberOptional.isPresent()) {
            int sum = numberOptional.get().stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println("Suma liczb: " + sum);
        } else {
            System.out.println("Optional jest pusty.");
        }
    }
}