package homework.inheritance;

import homework.composition.Size;
import homework.composition.Sole.Sole;

public class Sneaker extends Shoe {
    private String model;
    private String color;

    public Sneaker(String name, Size1 size, Sole sole, boolean isLeather, boolean isComfortable) {
        super(name, size, sole, isLeather, isComfortable);
    }

    public Sneaker(String name, Size1 size, Sole sole, boolean isLeather, boolean isComfortable, String model, String color) {
        super(name, size, sole, isLeather, isComfortable);
        this.model = model;
        this.color = color;
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

    @Override
    public String toString() {
        return "Sneaker{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
