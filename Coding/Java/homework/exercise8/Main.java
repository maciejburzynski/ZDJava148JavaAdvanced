package homework.exercise8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String regex = "[0-9]{2}-[0-9]{3}";

        Pattern pattern =  Pattern.compile(regex);

        System.out.println("Wpisz kod pocztowy: ");

        String zipCode = scanner.nextLine();

        try {
            validateZipCode(pattern, zipCode);
        }catch (IncorrectZipCodeException e){
            System.out.println(e.getMessage());
        }


    }

    private static void validateZipCode(Pattern pattern, String zipCode) throws IncorrectZipCodeException {
        Matcher matcher = pattern.matcher(zipCode);
        System.out.println(zipCode);
    if(!matcher.matches()){
        throw new IncorrectZipCodeException("Niepoprawny format kodu pocztowego");
    }


}}




