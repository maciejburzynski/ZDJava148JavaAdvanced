package homework.exerciseSelfMade.COLLECTIONS;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;



public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("banana");

        checkUnicalWords(words);


        }

    static void checkUnicalWords(ArrayList<String> array){
       Set<String> set = array.stream()
               .map(a->a.toString())
               .collect(Collectors.toSet());

       set.stream()
               .forEach(System.out::println);

    }
}
