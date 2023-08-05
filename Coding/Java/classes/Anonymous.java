package classes;

import inheritance.car.FourWheeler;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Anonymous {


    FourWheeler fourWheeler = new FourWheeler() {
        @Override
        public void drive() {
            System.out.println("Local/Anonymous fourWheeler");
        }
    };

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "Maciej",
                "Jarek",
                "Andrzej",
                "Jakub",
                "Bartek",
                "Inesa");
//      Custom function instead lambda - extended lambda
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        };

        stringList.stream()
                .map(function)
                .forEach(string -> System.out.println(string));


//      Lambda (Lambda działa tak samo jak metoda abstrakcyjna)
        stringList.stream()
                .map(string -> string.toLowerCase())
                .forEach(string -> System.out.println(string));


//      Method reference
        stringList.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);


//      Custom Predicate used to filter
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return string.contains("Bartek");
            }
        };

        stringList.stream()
                .filter(predicate)
                .forEach(element -> System.out.println(element));

//      Lambda
        stringList.stream()
                .filter(string -> string.contains("Bartek"))
                .forEach(element -> System.out.println(element));

//      Method Reference
        stringList.stream()
                .filter(Anonymous::verifyIfContainsBartek)
                .forEach(element -> System.out.println(element));


//      Anonymous
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        stringList.stream()
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });

//      Lambda
        stringList.stream()
                .forEach(string -> System.out.println(string));

//      Method reference
        stringList.stream()
                .forEach(System.out::println);
    }


    private static boolean verifyIfContainsBartek(String string) {
        return string.contains("Bartek");
    }
}