package homework.exercise9;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)  {

      List<Adress> adressList = new ArrayList();

      Adress adress = new Adress("01-234", "Warszaw","Kwiatowa",5,2);
      Adress adress2 = new Adress("12-345", "Kraków,","Słoneczna", 10, 15);
      Adress adress3 = new Adress("45-678", "Wrocław","Polna", 22, 4);
      Adress adress4 = new Adress("90-123", "Łódź","Ogrodowa", 7, 8);
      Adress adress5 = new Adress("56-789", "Poznań,","Leśna", 14, 9);
      Adress adress6 = new Adress("78-901", "Gdańsk,","Morska", 3, 7);
      Adress adress7 = new Adress("34-567", "Katowice","Górna", 18, 23);
      Adress adress8 = new Adress("89-012", "Szczecin","Wyzwolenia", 11, 6);
      Adress adress9 = new Adress("23-456", "Lublin,","Kwiatowa", 2, 1);
      Adress adress10 = new Adress("67-890", "Białystok","Piękna", 9, 12);


  adressList.add(adress);
  adressList.add(adress2);
  adressList.add(adress3);
  adressList.add(adress4);
  adressList.add(adress5);
  adressList.add(adress6);
  adressList.add(adress7);
  adressList.add(adress8);
  adressList.add(adress9);
  adressList.add(adress10);

  Optional<List<Adress>> optionalAdressList = Optional.of(adressList);

        System.out.println();
        System.out.println("Stwórz listę Miast występujących w adresach.");
        System.out.println("");


        if (optionalAdressList.isPresent()){
            adressList.stream()
                    .map(Adress::getCity)
                    .forEach(System.out::println);
        }

        System.out.println();
        System.out.println("Stwórz zbiór wartości kodów pocztowych z adresów.");
        System.out.println();

        if (optionalAdressList.isPresent()) {
            Set<String> postalCodes = optionalAdressList.get().stream()
                    .map(Adress::getZipCode) //
                    .collect(Collectors.toSet());

            if (!postalCodes.isEmpty()) {
                for (String postalCode : postalCodes) {
                    System.out.println("Postal code: " + postalCode);
                }
            }
        }
        System.out.println();
        System.out.println("Przefiltruj adresy, w których miasto to Kraków");
        System.out.println();


        if (optionalAdressList.isPresent()){
            adressList.stream()
                    .filter(adrr->adrr.getCity().equals("Kraków"))
                    .forEach(System.out::println);
        }


        System.out.println();
        System.out.println("Wykonaj na wszystkich obiektach Address metodę toString(). ");
        System.out.println();

        if (optionalAdressList.isPresent()){
            adressList.stream()
                    .forEach(Adress::toString);
        } else {
            System.out.println("Adress was empty.");
        }



    }}