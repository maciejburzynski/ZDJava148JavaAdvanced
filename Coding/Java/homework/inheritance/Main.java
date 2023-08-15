package homework.inheritance;

import homework.composition.Sole.Color;
import homework.composition.Sole.Material;
import homework.composition.Sole.Sole;

public class Main {
    public static void main(String[] args) {

        Sneaker sneaker = new Sneaker
                ("Reebok",Size1.SIZE_42,new Sole(Material.Rubber, Color.WHITE),false,true,"ZX","Green");

        SportShoe sportShoe = new SportShoe
                ("Nike",Size1.SIZE_39,new Sole(Material.Rubber,Color.BLACK),false,true,SportType.BASKETBALL,"Red");

        DressShoe dressShoe = new DressShoe
                ("Lasocki",Size1.SIZE_38,new Sole(Material.Natural,Color.BLACK),true,false,7.5, homework.inheritance.Material.LEATHER,"Black");

        System.out.println(sneaker);
        System.out.println(sportShoe);
        System.out.println(dressShoe);
    }

}
