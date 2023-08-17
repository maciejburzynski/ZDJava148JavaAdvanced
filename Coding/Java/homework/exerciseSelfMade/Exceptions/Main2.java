package homework.exerciseSelfMade.Exceptions;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz coś: ");
        String word = scanner.nextLine();

        try { int x = Integer.parseInt(word);

        }catch (NumberFormatException e) {
            e.printStackTrace();

        }finally {
            System.out.println("Tak sie przekształcać nie da");
        }
    }
}
