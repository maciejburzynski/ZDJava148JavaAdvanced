package homework.exerciseSelfMade.COLLECTIONS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {



        double num = 0;
        Scanner scanner = new Scanner(System.in);
        List<Double> numberList = new ArrayList();

        System.out.println("Wprowadź liczby całkowite, jeśli chcesz zakończyć wpisz liczbę powyżej 6: ");



        do {
            num = scanner.nextInt();
            numberList.add(num);

        }while (num != 0 && num !=8 && num !=9 && num !=7 );

        System.out.println("To są Twoje liczby :");
        numberList.stream()
                .forEach(System.out::println);


        System.out.println("O to średnia Twoich ocen: ");

        double summ = numberList.stream()
                .reduce((a1, a2)->a1+a2)
                .get();


        System.out.println(summ/numberList.size());

    }
    }

