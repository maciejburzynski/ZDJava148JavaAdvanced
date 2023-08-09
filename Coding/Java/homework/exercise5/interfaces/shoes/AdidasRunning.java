package homework.exercise5.interfaces.shoes;

import homework.exercise5.interfaces.inter.Shoe;
import homework.exercise5.interfaces.resources.Size;
import homework.exercise5.interfaces.inter.SportShoe;
import homework.exercise5.interfaces.resources.SportType;

public class AdidasRunning implements Shoe, SportShoe {
    private String color;
    private double price;

    public AdidasRunning(String color, double price) {
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
    public void checkSportType(SportType sportType) {
        switch (sportType) {
            case RUNNING:
                System.out.println("Your shoe is for running");
                break;
            case BOXING:
                System.out.println("Your shoe is for boxing");
                break;
            case BASKETBALL:
                System.out.println("Your shoe is for basketball");
                break;
            case TENNIS:
                System.out.println("Your shoe is for tennis");
                break;
            case CLIMBING:
                System.out.println("Your shoe is for climbing");
                break;
            default:
                System.out.println("Unknown sport type");
        }
    }


    @Override
    public void isHighTop(boolean highTop) {
        if (highTop) {
            System.out.println("The shoe has a high top.");
        } else {
            System.out.println("The shoe does not have a high top.");
        }
    }

    @Override
    public void isBreathable(boolean isBreathable) {
        if (isBreathable) {
            System.out.println("The shoe is breathable.");
        } else {
            System.out.println("The shoe is not breathable.");
        }
    }

    @Override
    public void isComfortable(boolean isComfortable) {
        if (isComfortable) {
            System.out.println("The shoe is comfortable.");
        } else {
            System.out.println("The shoe is not comfortable.");
        }
    }

    @Override
    public void isLeather(boolean isLeather) {
        if (isLeather) {
            System.out.println("The shoe is made from leather.");
        } else {
            System.out.println("The shoe is not made from leather.");
        }
    }
}