package composition.homework.exercise5.inheritance.Shoelace;

public class Shoelace {
    private Lenght length;
    private Color color;


    public Shoelace(Lenght length, Color color) {
        this.length = length;
        this.color = color;
    }

    @Override
    public String toString() {
        return "shoelace{" +
                "length=" + length +
                ", color=" + color +
                '}';
    }
}
