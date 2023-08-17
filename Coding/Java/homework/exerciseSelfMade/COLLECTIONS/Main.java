package homework.exerciseSelfMade.COLLECTIONS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int num = 0;
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList();

        System.out.println("Wprowadź liczby całkowite, jeśli chcesz zakończyć wpisz 0: ");



        do {
             num = scanner.nextInt();
            numberList.add(num);

        }while (num != 0);

        System.out.println("To są Twoje liczby :");
        numberList.stream()
                .forEach(System.out::println);


        System.out.println("O to suma Twoich liczb: ");

        int summ = numberList.stream()
                .reduce((a1, a2)->a1+a2)
                        .get();


        System.out.println(summ);

        }

}
