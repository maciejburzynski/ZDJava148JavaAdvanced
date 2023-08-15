package homework.composition;

import homework.composition.Sole.Color;
import homework.composition.Sole.Material;
import homework.composition.Sole.Sole;

public class Main {
    public static void main(String[] args) {

        SportShoe sportShoe = new SportShoe(
                new Shoe("Adidas",Size.SIZE_40,new Sole(Material.Rubber, Color.WHITE),
                        false,true), SportType.RUNNING,"Black");


        DressShoe dressShoe = new DressShoe(
                new Shoe("Jenny Fairy",Size.SIZE_38,new Sole(Material.Natural,Color.BLACK),
                        true,false),9,homework.composition.Material.LEATHER,"Black");

        Sneaker sneaker = new Sneaker(
                new Shoe("Nike",Size.SIZE_42,new Sole(Material.Rubber,Color.WHITE),false,true),"Jordan","Red"
        );
        System.out.println(sportShoe);
        System.out.println(dressShoe);
        System.out.println(sneaker);

    }


}
