package homework.exercise5.composition;
import homework.exercise5.composition.shoelace.Color;

import homework.exercise5.composition.shoelace.Lenght;
import homework.exercise5.composition.shoelace.Shoelace;

public class Main {

    public static void main(String[] args) {



            DressShoe dressShoe = new DressShoe(
                    new Shoe("Adidas", Size.SIZE_38, new Shoelace(Lenght.NORMAL, Color.BLACK), true, true),
                    Material.LEATHER, Occasion.BUSSINESS, 2, false
            );

            SportShoe sportShoe = new SportShoe(
                    new Shoe("Reebok", Size.SIZE_40, new Shoelace(Lenght.LONG, Color.RED), false, true),
                    SportType.TENNIS, true, true
            );

            Sneakers sneakers = new Sneakers(
                    new Shoe("Nike", Size.SIZE_41, new Shoelace(Lenght.NORMAL, Color.RED), true, true),
                    "airmax", "Black", true, true
            );

            System.out.println(dressShoe);
            System.out.println(sportShoe);
            System.out.println(sneakers);
        }
}



