package homework.exercise5.composition;

public class SportShoe {
    private Shoe shoe;
    private SportType sportType;

    private boolean breathable;
    private boolean hightTop;

    public SportShoe(Shoe shoe, SportType sportType, boolean breathable, boolean hightTop) {
        this.shoe = shoe;
        this.sportType = sportType;
        this.breathable = breathable;
        this.hightTop = hightTop;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public SportType getSportType() {
        return sportType;
    }

    public void setSportType(SportType sportType) {
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
                "shoe=" + shoe +
                ", sportType=" + sportType +
                ", breathable=" + breathable +
                ", hightTop=" + hightTop +
                '}';
    }
}
