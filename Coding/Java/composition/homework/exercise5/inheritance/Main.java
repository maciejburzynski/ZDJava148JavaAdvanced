package composition.homework.exercise5.inheritance;

import composition.homework.exercise5.composition.Occasion;
import composition.homework.exercise5.composition.Size;
import composition.homework.exercise5.composition.shoelace.Color;
import composition.homework.exercise5.composition.shoelace.Lenght;
import composition.homework.exercise5.composition.shoelace.Shoelace;

public class Main {
    public static void main(String[] args) {

        Sneaker sneaker = new Sneaker("Adidas", Size.SIZE_40,
                new Shoelace(Lenght.LONG, Color.BLACK), true, true,
                "AirForce", "Red", true, true);


        DressShoe dressShoe = new DressShoe("Guccio", Size.SIZE_41,
                new Shoelace(Lenght.NORMAL, Color.BLACK), true, true,
                Occasion.BUSSINESS, 2.6, true  );

        SportShoe sportShoe = new SportShoe("Nike", Size.SIZE_36,
                new Shoelace(Lenght.LONG, Color.WHITE),true,
                true,  SportType.BASKETBALL, true, true);

        System.out.println(sneaker.toString());
        System.out.println(dressShoe.toString());
        System.out.println(sportShoe.toString());

    }




}