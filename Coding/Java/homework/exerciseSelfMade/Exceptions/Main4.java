package homework.exerciseSelfMade.Exceptions;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz coś: ");
        String word = scanner.nextLine();

        try { int x = Integer.parseInt(word);

        }catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
}}
