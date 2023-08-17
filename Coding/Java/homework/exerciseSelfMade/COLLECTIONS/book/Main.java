package homework.exerciseSelfMade.COLLECTIONS.book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Book> library = new ArrayList();


    }

    public static void addBook(Book book, List<Book> list) {
        list.add(book);
    }

    public static void findByAuthor(List<Book> list, String author) {
        list.stream()
                .filter(book -> book.getAuthor().equals(author))
                .forEach(System.out::println);
    }

    public static void findByYear(List<Book> list, int year) {
        list.stream()
                .filter(book -> book.getYear() == year)
                .forEach(System.out::println);
    }
}


