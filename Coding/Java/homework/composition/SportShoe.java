package homework.composition;


public class SportShoe {
    private Shoe shoe;
    private SportType sportType;
    private String color;

    public SportShoe(Shoe shoe, SportType sportType, String color) {
        this.shoe = shoe;
        this.sportType = sportType;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SportShoe{" +
                "shoe=" + shoe +
                ", sportType=" + sportType +
                ", color='" + color + '\'' +
                '}';
    }
}
