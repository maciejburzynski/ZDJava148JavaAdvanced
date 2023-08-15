package homework.inheritance;

import homework.composition.Size;
import homework.composition.Sole.Sole;

public class SportShoe extends Shoe {
    private SportType sportType;
    private String color;

    public SportShoe(String name, Size1 size, Sole sole, boolean isLeather, boolean isComfortable) {
        super(name, size, sole, isLeather, isComfortable);
    }

    public SportShoe(String name, Size1 size, Sole sole, boolean isLeather, boolean isComfortable, SportType sportType, String color) {
        super(name, size, sole, isLeather, isComfortable);
        this.sportType = sportType;
        this.color = color;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SportShoe{" +
                "sportType=" + sportType +
                ", color='" + color + '\'' +
                '}';
    }
}
