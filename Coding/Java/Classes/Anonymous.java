package Classes;

import inheritance.FourWheeler;

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
        List<String> stringList = Arrays.asList("Maciej",
                "Jarek",
                "Andrzej",
                "Jakub",
                "Bartek",
                "Inesa");

        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return o.toString().toLowerCase();
            }
        };

        stringList.stream()
                .map(string -> string.toLowerCase())
                .forEach(string -> System.out.println(string));

        stringList.stream()
                .map(function)
                .forEach(string -> System.out.println(string));


        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.toString().contains("Bartek");
            }
        };



        stringList.stream()
                .filter(string -> string.contains("Bartek"))
                .forEach(element -> System.out.println(element));


        stringList.stream()
                .filter(predicate)
                .forEach(element -> System.out.println(element));

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

    }

}
