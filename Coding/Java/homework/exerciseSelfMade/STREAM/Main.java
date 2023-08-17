package homework.exerciseSelfMade.STREAM;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(123);
        listNumbers.add(456);
        listNumbers.add(789);
        listNumbers.add(213);
        listNumbers.add(324);
        listNumbers.add(435);
        listNumbers.add(432);
        listNumbers.add(4325);
        listNumbers.add(127);
        listNumbers.add(859);
        listNumbers.add(973);

        listNumbers.stream()
                .filter(integer -> (integer % 2 == 0))
                .forEach(System.out::println);


        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println();


        List<String> wordList = new ArrayList<>();

        wordList.add("apple");
        wordList.add("banana");
        wordList.add("grape");
        wordList.add("orange");
        wordList.add("kiwi");
        wordList.add("strawberry");
        wordList.add("pineapple");
        wordList.add("watermelon");
        wordList.add("pear");
        wordList.add("peach");

        List<Integer> sizeList = wordList.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(sizeList);


        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println();


        List<String> wordList2 = new ArrayList<>();

        wordList2.add("apple");
        wordList2.add("banana");
        wordList2.add("grape");
        wordList2.add("orange");
        wordList2.add("kiwi");
        wordList2.add("strawberry");
        wordList2.add("pineapple");
        wordList2.add("watermelon");
        wordList2.add("pear");
        wordList2.add("peach");


        String concatenatedWords = wordList2.stream()
                .collect(Collectors.joining(" "));

        Map<Character, Long> characterCountMap = concatenatedWords.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(characterCountMap);

        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println();

        List<Integer> listNumbers2 = new ArrayList<>();

        listNumbers2.add(1);
        listNumbers2.add(2);
        listNumbers2.add(3);
        listNumbers2.add(4);
        listNumbers2.add(5);
        listNumbers2.add(6);
        listNumbers2.add(7);
        listNumbers2.add(8);
        listNumbers2.add(9);
        listNumbers2.add(10);



        listNumbers2.stream()
                .map(a->a*a)
                .forEach(System.out::println);

        int sum = listNumbers2.stream()
                .map(a->a*a)
                .reduce(0, Integer::sum);

        System.out.println(sum);


        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println();


        List<String> wordList3 = new ArrayList<>();

        wordList3.add("apple");
        wordList3.add("banana");
        wordList3.add("grape");
        wordList3.add("orange");
        wordList3.add("kiwi");
        wordList3.add("strawberry");
        wordList3.add("pineapple");
        wordList3.add("watermelon");
        wordList3.add("pear");
        wordList3.add("peach");


        wordList3.stream()
                .sorted(Comparator.comparingInt(a->a.length()))
                .forEach(System.out::println);

    }
    }







