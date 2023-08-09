package homework.exercise5.inheritance;


import homework.exercise5.composition.Occasion;
import homework.exercise5.composition.Size;
import homework.exercise5.composition.shoelace.Shoelace;


public class DressShoe extends Shoe {

    private Occasion occasion;

    private double heelHeight;

    private boolean pointedToe;

    public DressShoe(String brand, Size size, Shoelace shoelace,
                     boolean isLeather, boolean isComfortable, Occasion occasion, double heelHeight, boolean pointedToe) {
        super(brand, size, shoelace, isLeather, isComfortable);
        this.occasion = occasion;
        this.heelHeight = heelHeight;
        this.pointedToe = pointedToe;
    }

    public Occasion getOccasion() {
        return occasion;
    }

    public void setOccasion(Occasion occasion) {
        this.occasion = occasion;
    }

    public double getHeelHeight() {
        return heelHeight;
    }

    public void setHeelHeight(double heelHeight) {
        this.heelHeight = heelHeight;
    }

    public boolean isPointedToe() {
        return pointedToe;
    }

    public void setPointedToe(boolean pointedToe) {
        this.pointedToe = pointedToe;
    }

    @Override
    public String toString() {
        return "DressShoe{" +
                "occasion=" + occasion +
                ", heelHeight=" + heelHeight +
                ", pointedToe=" + pointedToe +
                "} " + super.toString();
    }
}