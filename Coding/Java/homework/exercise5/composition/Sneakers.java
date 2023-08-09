package homework.exercise5.composition;

public class Sneakers {

    private Shoe shoe;
    private String model;
    private String color;

    private boolean haveShockAbsorbingSole;
    private boolean isStreetStyle;

    public Sneakers(Shoe shoe, String model, String color, boolean haveShockAbsorbingSole, boolean isStreetStyle) {
        this.shoe = shoe;
        this.model = model;
        this.color = color;
        this.haveShockAbsorbingSole = haveShockAbsorbingSole;
        this.isStreetStyle = isStreetStyle;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHaveShockAbsorbingSole() {
        return haveShockAbsorbingSole;
    }

    public void setHaveShockAbsorbingSole(boolean haveShockAbsorbingSole) {
        this.haveShockAbsorbingSole = haveShockAbsorbingSole;
    }

    public boolean isStreetStyle() {
        return isStreetStyle;
    }

    public void setStreetStyle(boolean streetStyle) {
        isStreetStyle = streetStyle;
    }

    @Override
    public String toString() {
        return "Sneakers{" +
                "shoe=" + shoe +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", haveShockAbsorbingSole=" + haveShockAbsorbingSole +
                ", isStreetStyle=" + isStreetStyle +
                '}';
    }
}


