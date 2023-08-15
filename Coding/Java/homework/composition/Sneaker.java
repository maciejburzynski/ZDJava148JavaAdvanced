package homework.composition;

public class Sneaker {
    private Shoe shoe;
    private String model;
    private String color;

    public Sneaker(Shoe shoe, String model, String color) {
        this.shoe = shoe;
        this.model = model;
        this.color = color;
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

    @Override
    public String toString() {
        return "Sneaker{" +
                "shoe=" + shoe +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
