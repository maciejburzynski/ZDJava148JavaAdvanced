package homework.Exercise7;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\przem\\IdeaProjects\\ZDJava148JavaAdvanced3\\Coding\\Java\\homework\\Exercise7\\adresy.txt";

        Scanner input = new Scanner(new File(path));
        List<Adress> addressList = new ArrayList<>();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] parts = line.split(",\\s*");

            if (parts.length == 5) {
                String zipCode = parts[0];
                String city = parts[1];
                String street = parts[2];
                String numberOfStreet = parts[3];
                String numberofHouse = parts[4];

                Adress newAddress = new Adress(zipCode, city, street, numberOfStreet, numberofHouse);
                addressList.add(newAddress);
            } else {
                System.out.println("Błędny format linii: " + line);
            }
        }

        for (Adress address : addressList) {
            System.out.println(address);
        }
    }
}