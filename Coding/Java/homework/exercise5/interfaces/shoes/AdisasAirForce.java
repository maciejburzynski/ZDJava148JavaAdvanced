package homework.exercise5.interfaces.shoes;

import homework.exercise5.interfaces.inter.Shoe;
import homework.exercise5.interfaces.resources.Size;
import homework.exercise5.interfaces.inter.Sneaker;

public class AdisasAirForce implements Shoe, Sneaker {
    private String color;
    private double price;

    public AdisasAirForce(String color, double price) {
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
        }
    }



    @Override
    public void checkHaveShockAbsorbingSole(boolean haveShockAbsorbingSole) {
            if (haveShockAbsorbingSole) {
                System.out.println("The shoe is have have shock absorbing sole.");
            } else {
                System.out.println("The shoe does not have  shock absorbing sole.");
            }
    }

    @Override
    public void checkIsStreetStyle(boolean isStreetStyle) {
            if (isStreetStyle) {
                System.out.println("The shoe have street style.");
            } else {
                System.out.println("The shoe is does not have steet style.");
            }
        }

    }

