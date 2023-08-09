package composition.homework.exercise5.inheritance;


import composition.homework.exercise5.composition.Size;
import composition.homework.exercise5.composition.shoelace.Shoelace;

public class SportShoe extends Shoe {

    private composition.homework.exercise5.inheritance.SportType sportType;

    private boolean breathable;
    private boolean hightTop;


    public SportShoe(String brand, Size size, Shoelace shoelace, boolean isLeather, boolean isComfortable, SportType sportType, boolean breathable, boolean hightTop) {
        super(brand, size, shoelace, isLeather, isComfortable);
        this.sportType = sportType;
        this.breathable = breathable;
        this.hightTop = hightTop;
    }

    public composition.homework.exercise5.inheritance.SportType getSportType() {
        return sportType;
    }

    public void setSportType(composition.homework.exercise5.inheritance.SportType sportType) {
        this.sportType = sportType;
    }

    public boolean isBreathable() {
        return breathable;
    }

    public void setBreathable(boolean breathable) {
        this.breathable = breathable;
    }

    public boolean isHightTop() {
        return hightTop;
    }

    public void setHightTop(boolean hightTop) {
        this.hightTop = hightTop;
    }

    @Override
    public String toString() {
        return "SportShoe{" +
                "sportType=" + sportType +
                ", breathable=" + breathable +
                ", hightTop=" + hightTop +
                "} " + super.toString();
    }
}
