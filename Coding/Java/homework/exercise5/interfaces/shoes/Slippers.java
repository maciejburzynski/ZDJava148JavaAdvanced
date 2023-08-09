package homework.exercise5.interfaces.shoes;


import homework.exercise5.interfaces.inter.DressShoe;
import homework.exercise5.interfaces.inter.Shoe;
import homework.exercise5.interfaces.resources.Material;
import homework.exercise5.interfaces.resources.Occasion;
import homework.exercise5.interfaces.resources.Size;

public class Slippers implements Shoe, DressShoe {
    private String color;
    private double price;

    public Slippers(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public void chooseSize(Size size) {
        switch (size) {
            case SIZE_36:
                System.out.println("Your shoe have size 36");
                break;
            case SIZE_37:
                System.out.println("Your shoe have size 37");
                break;
            case SIZE_38:
                System.out.println("Your shoe have size 38");
                break;
            case SIZE_39:
                System.out.println("Your shoe have size 39");
                break;
            case SIZE_40:
                System.out.println("Your shoe have size 40");
                break;
            case SIZE_41:
                System.out.println("Your shoe have size 41");
                break;
            case SIZE_42:
                System.out.println("Your shoe have size 42");
                break;
            case SIZE_43:
                System.out.println("Your shoe have size 43");
                break;
            case SIZE_44:
                System.out.println("Your shoe have size 44");
                break;
            case SIZE_45:
                System.out.println("Your shoe have size 45");
                break;
            case SIZE_46:
                System.out.println("Your shoe have size 46");
                break;
            default:
                System.out.println("Unknown size");
        }}

    @Override
    public void getOccasion(Occasion ocassion) {
            switch (ocassion) {
                case BUSSINESS:
                    System.out.println("The choosen shoe is good for business meetings");
                    break;
                case FOR_CELEBRATIONS:
                    System.out.println("The choosen shoe is good for parties, like weedings etc");
            }
        }



    @Override
    public void isLeatherOrSuede(Material material) {
        switch (material) {
            case LEATHER:
                System.out.println("The choosen shoe is made from leather");
                break;
            case SUEDE:
                System.out.println("The choosen shoe is made from suede");
        }

    }

    @Override
    public void isHeelHeight(boolean isHeelHeight) {
        if (isHeelHeight) {
            System.out.println("The shoe have heel height");
        } else {
            System.out.println("The shoe does not have heel height");
        }

    }

}
