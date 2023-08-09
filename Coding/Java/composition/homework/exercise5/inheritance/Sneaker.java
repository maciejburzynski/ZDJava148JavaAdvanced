package composition.homework.exercise5.inheritance;
import composition.homework.exercise5.composition.Size;
import composition.homework.exercise5.composition.shoelace.Shoelace;


public class Sneaker extends Shoe {




    private String model;
    private String color;

    private boolean haveShockAbsorbingSole;
    private boolean isStreetStyle;



    public Sneaker(String brand, Size size, Shoelace shoelace, boolean isLeather, boolean isComfortable, String model,
                   String color, boolean haveShockAbsorbingSole, boolean isStreetStyle) {
        super(brand, size, shoelace, isLeather, isComfortable);
        this.model = model;
        this.color = color;
        this.haveShockAbsorbingSole = haveShockAbsorbingSole;
        this.isStreetStyle = isStreetStyle;
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
        return "Sneaker{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", haveShockAbsorbingSole=" + haveShockAbsorbingSole +
                ", isStreetStyle=" + isStreetStyle +
                "} " + super.toString();
    }

}
